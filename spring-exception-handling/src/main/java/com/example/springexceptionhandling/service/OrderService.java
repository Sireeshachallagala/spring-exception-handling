package com.example.springexceptionhandling.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springexceptionhandling.exception.OrderServiceException;
import com.example.springexceptionhandling.model.Order;
import com.example.springexceptionhandling.repository.OrderDAO;

@Service
public class OrderService {

	@Autowired
	private OrderDAO orderDao;
	
	@PostConstruct
	public void addOrder2DB() {
		List<Order> order=new ArrayList<>();
		order.add(new Order(876,"Mobile","Electronics",8000));
		order.add(new Order(806,"Bike","Vehicle",80000));
		orderDao.saveAll(order);
	}
	
	public double getPrice(String productName) throws OrderServiceException {
		Order order=null;
		double amount=0;
		try {
			order=orderDao.findByName(productName);
			amount=order.getAmount();
		}catch (Exception e) {
			throw new OrderServiceException("Order Not found with product "+productName);
		}
		return amount;
	}
}
