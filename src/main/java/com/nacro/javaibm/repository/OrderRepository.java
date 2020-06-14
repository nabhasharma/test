package com.nacro.javaibm.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nacro.javaibm.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
