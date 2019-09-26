package com.usbank.orderservice.test;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.usbank.orderservice.model.Order;
import com.usbank.orderservice.service.OrderRepository;
import com.usbank.orderservice.service.OrderService;

@RunWith(SpringRunner.class)
@SpringBootTest

public class DemoOrderServiceApiTest {

	
	@Autowired
	private OrderService demoService;
	
	@MockBean
	private OrderRepository orderRepository;
	
	@Test
	public void getAllTopicsTest() {
		when(orderRepository.findAll()).thenReturn(Stream
				.of(new Order(21,"order1",22.50,"shipped"),new Order(22,"order2",45.00,"preparing")).collect(Collectors.toList()));
		assertEquals(2,demoService.findAll().size());
	}

}
