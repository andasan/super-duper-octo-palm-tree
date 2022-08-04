package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.entity.Customer;


@Controller
@RequestMapping("/customerReg")
public class customer_controller {

	
	@Autowired
	CustomerRepository custRepo;
	
	@GetMapping
	public String displayCustForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "redirect/order_controller/save";
	}
	
	@PostMapping("/save")
	public String saveCustomer(Customer customer) {
		custRepo.save(customer);
		return "redirect/orderput";
	}
	
	
	
	
	
}
