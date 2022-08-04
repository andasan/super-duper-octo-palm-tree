package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	
	@Override
	public List<Customer>findAll();
	
	
	public List<Customer> findByEmail(String email);
}
