package com.example.springexceptionhandling.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="ORDER_TB")
public class Order {
	
	@Id
	private int id;
	private String name;
	private String category;
	private double amount;
	public Order() {
		
	}
	public Order(int id, String name, String category, double d) {
		this.id=id;
		this.name=name;
		this.category=category;
		this.amount=d;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
