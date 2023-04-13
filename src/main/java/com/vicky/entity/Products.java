package com.vicky.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Entity
@Data
public class Products {
	
	@Id
	private Integer productId;
	private String productName;
	private Double productPrice;
	private Integer categoryId;
	
	@Lob
	private byte[] productImage;

}
