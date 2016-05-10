package ua.kozak.dao;

import java.util.List;

import ua.kozak.entity.Product;

public interface ProductDAO {

	void insert(Product product);
	
	Product findById(int id);
	
	List<Product> getAllProducts();
	
	void remove(Product product);
	
	void update(Product product);
}
