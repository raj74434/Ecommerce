package com.handy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handy.models.Product;
import com.handy.repo.ProductDao;

@Service
public class AdminServicesImpl implements AdminServices {

	@Autowired
	private ProductDao pd;
	
	@Override
	public Product addNewProduct(Product p) {
		return pd.save(p);
	}

}
