package com.usbank.orderservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usbank.orderservice.model.Order;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	public Order save(Order topic) {
		// TODO Auto-generated method stub
		return orderRepository.save(topic) ;
		}

	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	public Order findOne(int id) {
		// TODO Auto-generated method stub
		return orderRepository.findOne(id);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		orderRepository.delete(id);
	}

}
