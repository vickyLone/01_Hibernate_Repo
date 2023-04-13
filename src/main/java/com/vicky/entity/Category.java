package com.vicky.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tbl_Category")
@Data
public class Category {
	
	@Id
	private Integer categoryId;
	private String categoryName;
	private Double categoryPrice;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "categoryId")
    List<Products> listOfProducts;
}
