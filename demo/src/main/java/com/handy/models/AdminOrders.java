package com.handy.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdminOrders {

	@Id
	private Integer userId;
	
	private String userName;
	
	private List<ProductConsumer> listOfProduct ;
	
	private Integer billAmount;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<ProductConsumer> getListOfProduct() {
		return listOfProduct;
	}

	public void setListOfProduct(List<ProductConsumer> listOfProduct) {
		this.listOfProduct = listOfProduct;
	}

	public Integer getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Integer billAmount) {
		this.billAmount = billAmount;
	}
	
	
	
}
