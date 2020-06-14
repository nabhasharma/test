package com.nacro.javaibm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nacro.javaibm.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}