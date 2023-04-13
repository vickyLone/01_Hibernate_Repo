package com.vicky.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.vicky.dao.ProductsDao;
import com.vicky.entity.Products;

public class ProductsDaoImpl implements ProductsDao {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	public void saveProducts(Products product) {
       EntityManager entityManager = factory.createEntityManager();
       EntityTransaction tx = entityManager.getTransaction();
       tx.begin();
       
       try {
    	   entityManager.persist(product);
    	   tx.commit();
    	   
    	   System.out.println("Data Saved ...");
    	   
       }catch(Exception e) {
    	   tx.rollback();
    	   e.printStackTrace();
    	   System.out.println("Something went wrong...");
       }
       finally {
    	   entityManager.close();
       }
       
	}

	public ProductsDaoImpl fetchproducts(Products productId) {
		// TODO Auto-generated method stub
		return null;
	}

}
