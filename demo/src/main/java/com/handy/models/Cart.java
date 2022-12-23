package com.handy.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer cartId;
	@OneToMany
	List<ProductConsumer> cartItems;
	
	private Integer bill_amount;
	
	
}
