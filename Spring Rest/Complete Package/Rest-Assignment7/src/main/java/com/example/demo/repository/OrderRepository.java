<<<<<<< HEAD
package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {

	public Order findByitem(String item);

	public List<Order> findByprice(long price);

	public List<Order> findByquantity(long quantity);

}
=======
package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {

	public Order findByitem(String item);

	public List<Order> findByprice(long price);

	public List<Order> findByquantity(long quantity);

}
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
