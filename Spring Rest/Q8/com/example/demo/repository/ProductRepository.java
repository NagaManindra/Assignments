<<<<<<< HEAD
package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
	public Product findByName(String name);

	public List<Product> findByCost(float cost);

	public List<Product> findByMDate(Date date);

}
=======
package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
	public Product findByName(String name);

	public List<Product> findByCost(float cost);

	public List<Product> findByMDate(Date date);

}
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
