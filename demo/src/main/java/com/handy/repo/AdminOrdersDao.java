package com.handy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.handy.models.AdminOrders;

public interface AdminOrdersDao extends JpaRepository<AdminOrders, Integer> {

}
