package com.vicky.dao;

import com.vicky.entity.Products;
import com.vicky.impl.ProductsDaoImpl;

public interface ProductsDao {
	
	public void saveProducts(Products product);
	
	public ProductsDaoImpl  fetchproducts(Products  productId);

}
