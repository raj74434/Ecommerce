package com.handy.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductConsumer {

	@Id
	private Integer product_id;
	
	private String product_name;
	private String category;
	private Integer quantity;
	private Integer price;
	
	
}
