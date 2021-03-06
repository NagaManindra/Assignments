package com.rabbit.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rabbit.model.Customer;

@Repository
public interface CustomerRepo extends MongoRepository<Customer, String> {

}
