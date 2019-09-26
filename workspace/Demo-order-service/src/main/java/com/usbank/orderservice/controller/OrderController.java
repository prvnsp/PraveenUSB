package com.usbank.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usbank.orderservice.model.Order;
import com.usbank.orderservice.service.OrderService;

@RestController
@RequestMapping("/orderinventory")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping("/addorder")
	public Order saveOrder(@RequestBody Order order) {
		return orderService.save(order);
		
	}
	
	@GetMapping("/getallorders")
	public List<Order> getAllOrders(){
		return orderService.findAll();
	}
	
	@GetMapping("/findorders/{id}")
	public Order getOrderById(@PathVariable int id){
		return orderService.findOne(id);
	}
	
	@DeleteMapping("/deleteorder/{id}")
	public String deleteOrderById(@PathVariable int id){
		orderService.delete(id);
		 return "Deleted by id";
	}
}
