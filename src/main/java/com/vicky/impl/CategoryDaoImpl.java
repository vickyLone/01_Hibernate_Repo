package com.vicky.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.vicky.dao.CategoryDao;
import com.vicky.entity.Category;

public class CategoryDaoImpl implements CategoryDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	public void saveCategory(Category category) {

		EntityManager entity = factory.createEntityManager();
		EntityTransaction tx = entity.getTransaction();
		tx.begin();

		try {
			entity.persist(category);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			System.out.println("Something Went Wrong...");
		} finally {
			entity.close();
			

		}

	}

	public CategoryDaoImpl fetchCategory(Category categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

}
