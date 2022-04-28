package com.rabbit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rabbit.model.Customer;
import com.rabbit.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@PostMapping(value = "/create")
	public String producer(@RequestParam("customerId") String customerId,
			@RequestParam("customerName") String customerName) {

		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		customer.setCustomerName(customerName);

		customerService.send(customer);

		return "Message sent to the Queue Successfully";
	}

	@GetMapping("/getAll")
	public List<Customer> findAll() {
		return customerService.getAll();
	}

}
