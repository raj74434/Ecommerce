package com.handy.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
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
	@OneToMany(cascade = CascadeType.ALL)
	List<ProductConsumer> cartItems=new ArrayList<>();
	
	private Integer bill_amount;

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public List<ProductConsumer> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<ProductConsumer> cartItems) {
		this.cartItems = cartItems;
	}

	public Integer getBill_amount() {
		return bill_amount;
	}

	public void setBill_amount(Integer bill_amount) {
		this.bill_amount = bill_amount;
	}
	
	
}
