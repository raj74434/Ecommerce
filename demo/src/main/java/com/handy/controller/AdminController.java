package com.handy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.handy.models.Product;
import com.handy.services.AdminServicesImpl;

@RestController
public class AdminController {

	private AdminServicesImpl psi;
	
	@PostMapping("/addNewProduct")
	public ResponseEntity<Product> addNewProduct(@RequestBody Product product) {
		Product p=psi.addNewProduct(product);
		return new ResponseEntity<>(p,HttpStatus.ACCEPTED);
	}
}
