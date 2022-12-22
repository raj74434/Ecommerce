package com.handy.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;
	
	private String productName;
	private String Category; 
	private Integer quantity;
	private Integer price;
	private String discription; 
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<ProductConsumer> ProductConsumer;
}
