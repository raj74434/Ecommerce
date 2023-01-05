package com.handy.services;

import java.util.List;

import com.handy.models.AdminOrders;
import com.handy.models.Product;

public interface AdminServices {

	public Product addNewProduct(Product p) ;
		
	public Product findProductById(Integer id) throws Exception ;
		
	public Product updateQuantity(Product p,Integer queantity);
	
	public List<AdminOrders> getAllOrderRecevidfromUsers();
	
	public AdminOrders updateDelveryStatus(String status,Integer id) throws Exception;
	
}
