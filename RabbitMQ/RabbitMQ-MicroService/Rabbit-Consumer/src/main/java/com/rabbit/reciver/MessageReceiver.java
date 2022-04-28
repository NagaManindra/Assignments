package com.rabbit.reciver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rabbit.model.Product;
import com.rabbit.repo.ConsumerRepo;

@Component
public class MessageReceiver {
	@Autowired
	private ConsumerRepo repo;

	public void receiveMsg(Product product) {
		repo.save(product);
		System.out.println("product object is Received: " + product.getName());
		System.out.println(product + " inserted into DataBase");

	}

}
