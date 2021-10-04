package com.example.springexceptionhandling.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.springexceptionhandling.exception.OrderServiceException;
import com.example.springexceptionhandling.model.OrderError;

@ControllerAdvice
public class ExceptionAdvice {
	
	@ExceptionHandler(OrderServiceException.class)
	public ResponseEntity<OrderError>  mapException(OrderServiceException ordEx){
		OrderError ordErr=new OrderError(HttpStatus.INTERNAL_SERVER_ERROR.value(),ordEx.getMessage());
		return new ResponseEntity<OrderError>(ordErr,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
