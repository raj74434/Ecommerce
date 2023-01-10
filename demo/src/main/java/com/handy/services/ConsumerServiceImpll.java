package com.handy.services;

import java.util.List;

import com.handy.models.Consumer;
import com.handy.models.Product;
import com.handy.repo.ProductDao;

public class ConsumerServiceImpll implements ConsumerService {

	private ProductDao productDao;
	
	@Override
	public Consumer registerConsumer() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Product> searchProductByName(String name) throws Exception{
		
		List<Product> products= productDao.findByProductName(name);
		
		if(products.size()<1) {
			throw new Exception();
		}
		
		return products;
	}

}
