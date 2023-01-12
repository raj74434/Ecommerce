package com.handy.controller;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.handy.models.Cart;
import com.handy.models.Consumer;
import com.handy.models.Product;
import com.handy.models.ProductConsumer;
import com.handy.services.ConsumerServiceImpll;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private ConsumerServiceImpll consumerServiceImpll;
	
	public ResponseEntity<Consumer> registerConsumer(@RequestBody Consumer c){
		
	return new ResponseEntity<>(consumerServiceImpll.registerConsumer(c),HttpStatus.ACCEPTED);
		
	}
	
	public ResponseEntity<List<Product>> searchProductByName(@PathVariable("name") String name) throws Exception{
		
		return new ResponseEntity<>(consumerServiceImpll.searchProductByName(name),HttpStatus.ACCEPTED);
			
		
		
	}
	
public ResponseEntity<Cart> addInCart(Integer id ,Integer  productId , Integer quantity) throws Exception{
		
	Product product=consumerServiceImpll.searchProductById(productId);
	
	Cart cart=consumerServiceImpll.addInCart(id, product, quantity);
	
	return new ResponseEntity<>(cart,HttpStatus.ACCEPTED);
			
		
		
	}
	
}
