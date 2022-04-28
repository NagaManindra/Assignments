package com.rabbit.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rabbit.model.Product;

@Repository
public interface ProducerRepo extends MongoRepository<Product, String> {

}
