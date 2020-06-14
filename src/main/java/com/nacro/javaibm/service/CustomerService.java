package com.nacro.javaibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nacro.javaibm.entity.Order;
import com.nacro.javaibm.repository.OrderRepository;

@Service
public class CustomerService {
	 @Autowired
	   private OrderRepository orderRepository;
	 

	   
	   public Order getOrder(int orderId) {
			return orderRepository.findById(orderId).get();
		}

	public List<Order> orderByCustomer(int customerId) {
		// TODO Auto-generated method stub
		return (List<Order>) orderRepository.findById(customerId).get();
	}
}
