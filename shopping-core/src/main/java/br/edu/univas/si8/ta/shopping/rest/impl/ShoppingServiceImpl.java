package br.edu.univas.si8.ta.shopping.rest.impl;

import javax.ejb.EJB;

import br.edu.univas.si8.ta.shopping.api.ShoppingService;
import br.edu.univas.si8.ta8.shopping.ejb.interfaces.Shopping;

public class ShoppingServiceImpl implements ShoppingService {
	
	@EJB(mappedName = "java:app/shopping-ejb-0.1-SNAPSHOT/ShoppingBean!br.edu.univas.si8.ta8.shopping.ejb.interfaces.ShoppingRemote")
	
	private Shopping shopping;

	@Override
	public String[] listOrderShoppingNames() {
		return shopping.ListAllShoppingNames();
	}

	@Override
	public String saveOrderShopping(String description) {
		shopping.createNewShopping(description);
		return "{\"Message\": \"Success\"}";
	}
}
