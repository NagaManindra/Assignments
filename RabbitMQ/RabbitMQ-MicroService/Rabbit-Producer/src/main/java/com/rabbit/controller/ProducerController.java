package com.rabbit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rabbit.model.Product;
import com.rabbit.service.ProducerService;

@RestController
@RequestMapping("/customer")
public class ProducerController {

	@Autowired
	ProducerService service;

	/*
	 * @PostMapping(value = "/create") public String
	 * producer(@RequestParam("customerId") String customerId,
	 * 
	 * @RequestParam("customerName") String customerName) {
	 * 
	 * Customer customer = new Customer(); customer.setCustomerId(customerId);
	 * customer.setCustomerName(customerName);
	 * 
	 * customerService.send(customer);
	 * 
	 * return "Message sent to the Queue Successfully"; }
	 */
	@PostMapping(value = "/create")
	public String producer(@RequestParam("productId") int productId, @RequestParam("name") String name,
			@RequestParam("quantity") int quantity) {

		service.create(productId, name, quantity);

		return "Message sent to the Queue Successfully";
	}

	@GetMapping("/getAll")
	public List<Product> findAll() {
		return service.findAll();
	}

}
