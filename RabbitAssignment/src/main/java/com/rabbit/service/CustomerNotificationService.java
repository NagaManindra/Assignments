package com.rabbit.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rabbit.model.Customer;
import com.rabbit.repo.CustomerRepo;

@Component
public class CustomerNotificationService {

	@Autowired
	CustomerRepo custRepo;

	@RabbitListener(queues = "rabbit.assignment.queue")
	public void consumeMessage(Customer customer) {
		custRepo.save(customer);
		System.out.println("Data retrived and added to the database Successfully");
	}
}
