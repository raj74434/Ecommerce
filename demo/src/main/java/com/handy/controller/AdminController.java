package com.handy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.handy.models.AdminOrders;
import com.handy.models.Product;
import com.handy.services.AdminServicesImpl;

@RestController
@RequestMapping("admin")
public class AdminController {

	@Autowired
	private AdminServicesImpl psi;
	
	@PostMapping("/addNewProduct")
	public ResponseEntity<Product> addNewProduct(@RequestBody Product product) {
		Product p=psi.addNewProduct(product);
		return new ResponseEntity<>(p,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/findProductById")
	public  ResponseEntity<Product> findProductById (@PathVariable("id") Integer id) throws Exception{
		return new ResponseEntity<>(psi.findProductById(id),HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/updateQuantity/{id}/{new}")
 	public ResponseEntity<Product> updateQuantity(@PathVariable("id") Integer id,@PathVariable("new") Integer q ) throws Exception{
		Product product=psi.findProductById(id);
		
		Product result=psi.updateQuantity(product, q);
		
		return new ResponseEntity<>(result,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/getAllOrderRecevidfromUsers")
	public ResponseEntity<List<AdminOrders>> getAllOrderRecevidfromUsers(){
		List<AdminOrders> result=psi.getAllOrderRecevidfromUsers();
		
		return new ResponseEntity<>(result,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/updateDelveryStatus/{status}/{id}")
	public ResponseEntity<AdminOrders> updateDelveryStatus(@PathVariable("status") String status
			,@PathVariable("id")Integer id) throws Exception{
		return new ResponseEntity<>(psi.updateDelveryStatus(status, id),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/searchByOrderId")
	public ResponseEntity<AdminOrders> searchByOrderId(@PathVariable("id") Integer id) throws Exception{
		return new ResponseEntity<>(psi.searchByOrderId(id),HttpStatus.ACCEPTED);
	}
	
	
	
	
	
}
