package com.handy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handy.models.AdminOrders;
import com.handy.models.Product;
import com.handy.repo.AdminOrdersDao;
import com.handy.repo.ProductDao;

@Service
public class AdminServicesImpl implements AdminServices {

	@Autowired
	private ProductDao pd;
	
	@Autowired
	private AdminOrdersDao aod;
	
	@Override
	public Product addNewProduct(Product p) {
		return pd.save(p);
	}

	@Override
	public Product findProductById(Integer id) throws Exception {
	
		Optional<Product> op= pd.findById(id);
		
		if(op.isPresent()) {
			return op.get();
		}
		
		throw new Exception();
	}

	@Override
	public Product updateQuantity(Product p, Integer queantity) {
		
		p.setQuantity(queantity);
		
		
		return pd.save(p);
	}

	@Override
	public List<AdminOrders> getAllOrderRecevidfromUsers() {
		
		
		
		return aod.findAll();
	}
	

}
