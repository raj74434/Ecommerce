package com.handy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handy.models.Cart;
import com.handy.models.Consumer;
import com.handy.models.Orders;
import com.handy.models.Product;
import com.handy.models.ProductConsumer;
import com.handy.repo.ConsumerDao;
import com.handy.repo.ProductDao;

@Service
public class ConsumerServiceImpll implements ConsumerService {

	@Autowired
	private ConsumerDao consumerDao;
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private Orders orders;
	
	@Autowired
	private Cart cart;
	
	@Autowired
	private ProductConsumer productConsumer;
	
	
	public Consumer findById(Integer id) throws Exception {
		Optional<Consumer> optional=consumerDao.findById(id);
		
		if(optional.isEmpty()) {
			throw new Exception();
		}
		return optional.get();
	}
	
//	@Override
	public Consumer registerConsumer(Consumer consumer) {
		
		consumer.setCart(cart);;
		
		return consumerDao.save(consumer);
		
	}
	
	public List<Product> searchProductByName(String name) throws Exception{
		
		List<Product> products= productDao.findByProductName(name);
		
		if(products.size()<1) {
			throw new Exception();
		}
		
		return products;
	}
	
public Product searchProductById(Integer id) throws Exception{
		
		Optional<Product> products= productDao.findById(id);
		
		if(products.isEmpty()) {
			throw new Exception();
		}
		
		return products.get();
	}
	
	public Cart  addInCart(Integer id ,Product product , Integer quantity) throws Exception {
		
		productConsumer.setCategory(product.getCategory());
		productConsumer.setPrice(product.getPrice()*quantity);
		productConsumer.setProduct_name(product.getProductName());
		productConsumer.setQuantity(quantity);
		
		Consumer consumerObj=this.findById(id);
		Cart cart=consumerObj.getCart();
		cart.setBill_amount(cart.getBill_amount()+productConsumer.getPrice());
		
		List<ProductConsumer> lst=cart.getCartItems();
		lst.add(productConsumer);
		
		return cart;
	}

}
