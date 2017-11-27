package dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import entities.Shopping;

@Stateless
public class ShoppingDAO {
	
	@PersistenceContext(unitName = "shopping_order")
	private EntityManager em;

	public void insert(Shopping shop) {
		em.persist(shop);
	}

	public List<Shopping> listAll() {
		return em.createQuery("from shopping_order p", Shopping.class).getResultList();
	}
}