package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Orders;

public interface OrdersRepository extends CrudRepository<Orders, Long>{

	
	@Override
	public List<Orders>findAll();
	
}
