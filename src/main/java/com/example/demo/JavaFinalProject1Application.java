package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.OrdersRepository;

@SpringBootApplication
public class JavaFinalProject1Application {

	
	@Autowired
	CustomerRepository custRepo;
	
	@Autowired
	OrdersRepository orderRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(JavaFinalProject1Application.class, args);
	}

}
