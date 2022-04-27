package com.rabbit.service;

import java.util.List;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.rabbit.model.Customer;
import com.rabbit.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	@Autowired
	private AmqpTemplate rabbitTemplate;

	@Value("${rabbitmq.exchange}")
	private String exchange;

	@Value("${rabbitmq.routingkey}")
	private String routingkey;

	public void send(Customer customer) {
		rabbitTemplate.convertAndSend(exchange, routingkey, customer);
		System.out.println("Send msg = " + customer);

	}

	public List<Customer> getAll() {
		return customerRepo.findAll();
	}
}
