package com.usbank.orderservice.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.usbank.orderservice.model.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order,Integer> {

}
