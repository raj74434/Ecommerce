package com.handy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.handy.models.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
