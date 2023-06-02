package com.pms.dao;

import java.util.List;

import com.pms.model.Product;

public interface ProductDAO {
	
	public void saveProduct();
	public List<Product>viewAllProducts();
	
	public Product viewProduct(int pid);
	
	public void deleteProduct(int pid);

}
