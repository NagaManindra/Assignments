<<<<<<< HEAD
package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

	public Customer findByFirstName(String firstName, String lastName);
}
=======
package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

	public Customer findByFirstName(String firstName, String lastName);
}
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
