package com.handy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.handy.models.Consumer;

public interface ConsumerDao extends JpaRepository<Consumer, Integer>{

}
