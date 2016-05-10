package ua.kozak.service;

import java.util.List;

import ua.kozak.entity.Product;

public interface ProductService {

	public void add(String name,double price);
	
	public List<Product> getAllProducts();
	
	public void update(int id,String name,double price);
	
	public void remove(int id);
}
