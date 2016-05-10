package ua.kozak.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ua.kozak.dao.ProductDAO;
import ua.kozak.entity.Product;

@Repository
public class ProductDAOImp implements ProductDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	public void insert(Product product){
		entityManager.persist(product);
	}
	
	public Product findById(int id){
		return entityManager.find(Product.class, id);
	}
	
	public List<Product> getAllProducts(){
		return entityManager.createQuery("from Product",Product.class).getResultList();
	}
	
	public void remove(Product product){
		entityManager.remove(product);
	}
	
	public void update(Product product){
		entityManager.merge(product);
	}
}
