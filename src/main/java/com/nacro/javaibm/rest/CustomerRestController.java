package com.nacro.javaibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nacro.javaibm.entity.Order;
import com.nacro.javaibm.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

	
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/orders/{id}")
	public Order getPosts(@PathVariable("id") int orderId){
		return customerService.getOrder(orderId);
	}
	
	@GetMapping("/customer/{id}/order")
	public List<Order> orderByCustomer(@PathVariable("id") int customerId){
		return customerService.orderByCustomer(customerId);
	}
}
