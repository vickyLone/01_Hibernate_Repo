package com.vicky.dao;

import com.vicky.entity.Category;
import com.vicky.impl.CategoryDaoImpl;

public interface CategoryDao {
	
	public void saveCategory(Category category);
	
	public CategoryDaoImpl fetchCategory(Category categoryId);


}
