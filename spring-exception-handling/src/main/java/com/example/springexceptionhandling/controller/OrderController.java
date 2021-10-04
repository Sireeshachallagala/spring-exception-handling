package com.example.springexceptionhandling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springexceptionhandling.exception.OrderServiceException;
import com.example.springexceptionhandling.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService ordService;
	
	@GetMapping("/getPrice/{productName}")
	public String getOrderPrice(@PathVariable String productName) throws OrderServiceException {
		double amount=ordService.getPrice(productName);
		return "Amount for product "+productName+"is "+amount;
		
	}

}
