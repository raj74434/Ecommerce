package com.handy.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Cart {

	@OneToMany
	List<ProductConsumer> cartItems;
	
	private Integer bill_amount;
	
	
}
