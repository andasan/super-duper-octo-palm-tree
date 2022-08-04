package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.OrdersRepository;
import com.example.demo.data.Itens;
import com.example.demo.entity.Orders;


@Controller
@RequestMapping("/orderput")
public class order_controller {

		@Autowired
		OrdersRepository orderRepo;
		

		@GetMapping
		public String displayOrderForm(Model model) {
		Itens item =new Itens();
		model.addAttribute("Products", item.getProducts());
		model.addAttribute("Version", item.getVersion());
		model.addAttribute("order", new Orders());
		return "orderput";
		}
		
		@GetMapping("/check")
		public String displayOrders(Model model) {
			List <Orders> orderl= orderRepo.findAll();
			model.addAttribute("Orderlist", orderl);
			return "order-list";
		}
		
		
		@PostMapping("/save")
		public String orderPlace(Orders order) {
			orderRepo.save(order);
			return "redirect:/orderput";
		}
		
}
