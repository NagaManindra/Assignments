package com.rabbit.service;

import java.util.List;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabbit.model.Product;
import com.rabbit.repo.ProducerRepo;

@Service
public class ProducerService {
	@Autowired
	private ProducerRepo repo;
	@Autowired
	private AmqpTemplate rabbitTemplate;
	final static String queueName = "message_queue";

	public List<Product> findAll() {
		return repo.findAll();
	}

	public String create(int productId, String name, int quantity) {

		Product product = new Product();
		product.setProductId(productId);
		product.setName(name);
		product.setQuantity(quantity);

		rabbitTemplate.convertAndSend(queueName, product);
		System.out.println("product object has been sent successfully to Queue");

		return product.toString();
	}

}
