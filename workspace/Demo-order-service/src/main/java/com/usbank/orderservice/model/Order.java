package com.usbank.orderservice.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="order")

public class Order {

	@Id
	private int id;
	private String productName;
	private double price;
	private String orderStatus;
	
	public Order() {
		
	}
	
	public Order(int id, String productName,double price , String orderStatus) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
		this.orderStatus=orderStatus;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	
	
}
