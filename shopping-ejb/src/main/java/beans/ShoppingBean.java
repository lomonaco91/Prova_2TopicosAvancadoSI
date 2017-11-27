package beans;

import java.util.stream.Collectors;
import javax.ejb.EJB;
import br.edu.univas.si8.ta8.shopping.ejb.interfaces.ShoppingLocal;
import br.edu.univas.si8.ta8.shopping.ejb.interfaces.ShoppingRemote;
import dao.ShoppingDAO;
import entities.Shopping;

public class ShoppingBean implements ShoppingLocal, ShoppingRemote {
	
	@EJB
	private ShoppingDAO shopDAO;

	@Override
	public void createNewShopping(String shoppingDescription) {
		Shopping shop = new Shopping();
		shop.setDescription(shoppingDescription);
		
	}

	@Override
	public String[] listShopingNames() {
		return shopDAO.listAll().stream().map(Shopping::getDescription).collect(Collectors.toList())
				.toArray(new String[0]);
	}

}
