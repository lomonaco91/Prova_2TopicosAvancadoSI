package br.edu.univas.si8.ta.shopping.rest.impl;

import br.edu.univas.si8.ta.shopping.api.ShoppingService;
import br.edu.univas.si8.ta8.shopping.ejb.interfaces.Shopping;

public class ShoppingServiceImpl implements ShoppingService {
	
	
	private Shopping shopping;

	@Override
	public String[] listOrderShopping() {
		return shopping.listShopingNames();
	}

	@Override
	public String addOrderShopping(String description) {
		shopping.createNewShopping(description);
		return null;
	}
	
	

}
