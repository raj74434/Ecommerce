package com.handy.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class AdminOrders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;
	
	private Integer userId;
	
	private String userName;
	
	@OneToMany
	private List<ProductConsumer> listOfProduct ;
	
	private Integer billAmount;
	
	private String status;
	
	private String refund;

	private LocalDate date;
	
	
	
	
	
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Integer getOrderId() {
		return orderId;
	}

//	public void setOrderId(Integer orderId) {
//		this.orderId = orderId;
//	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRefund() {
		return refund;
	}

	public void setRefund(String refund) {
		this.refund = refund;
	}

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
