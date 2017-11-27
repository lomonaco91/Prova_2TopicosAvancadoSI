package beans;

import br.edu.univas.si8.ta8.shopping.ejb.interfaces.ShoppingLocal;
import br.edu.univas.si8.ta8.shopping.ejb.interfaces.ShoppingRemote;

public class ShoppingBean implements ShoppingLocal, ShoppingRemote {

	@Override
	public void createNewShopping(String shoppingDescription) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String[] listShopingNames() {
		// TODO Auto-generated method stub
		return null;
	}

}
