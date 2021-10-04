package com.example.springexceptionhandling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springexceptionhandling.model.Order;

@Repository
public interface OrderDAO extends JpaRepository<Order, Integer>{

	Order findByName(String productName);

}
