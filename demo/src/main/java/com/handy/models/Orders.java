package com.handy.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;
	
	@OneToMany
	private List<ProductConsumer> productList; 
	
	private Integer bill;
	
	private String status;
	
}
