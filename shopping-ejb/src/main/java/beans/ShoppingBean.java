package beans;

import java.sql.Timestamp;
import java.util.stream.Collectors;
import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import br.edu.univas.si8.ta8.shopping.ejb.interfaces.ShoppingLocal;
import br.edu.univas.si8.ta8.shopping.ejb.interfaces.ShoppingRemote;
import dao.ShoppingDAO;
import entities.Shopping;

@Stateless
@Local(ShoppingLocal.class)
@Remote(ShoppingRemote.class)
public class ShoppingBean implements ShoppingLocal, ShoppingRemote {
	
	@EJB
	private ShoppingDAO shopDAO;

	@Override
	public void createNewShopping(String shoppingDescription) {
		Shopping shopping = new Shopping();
		shopping.setDescription(shoppingDescription);
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		shopping.setOrderTime(timestamp);
		shopDAO.insert(shopping);
		
	}

	@Override
	public String[] ListAllShoppingNames() {
		return shopDAO.listAll()
				.stream()
				.map(Shopping::getDescription)
				.collect(Collectors.toList())
				.toArray(new String[0]);
	}
}
