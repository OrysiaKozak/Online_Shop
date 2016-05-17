package ua.kozak.servise.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.kozak.dao.ProductDAO;
import ua.kozak.entity.Product;
import ua.kozak.service.ProductService;

@Service
public class ProductServiceImp implements ProductService{

	@Autowired
	private ProductDAO productDAO;
	
	@Override
	@Transactional
	public void add(String name, double price) {
		productDAO.insert(new Product(name, price));
	}

	@Override
	public List<Product> getAllProducts() {
		return productDAO.getAllProducts();
	}

	@Override
	@Transactional
	public void update(int id,String name,double price) {
		Product product = productDAO.findById(id);
		product.setProductName(name);
		product.setPrice(price);
		productDAO.update(product);
	}

	@Override
	@Transactional
	public void remove(int id) {
		Product  product = productDAO.findById(id);
		productDAO.remove(product);
	}

}
