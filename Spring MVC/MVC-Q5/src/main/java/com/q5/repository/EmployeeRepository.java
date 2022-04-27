<<<<<<< HEAD
package com.q5.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.q5.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
	public Employee findByEmployeeName(String name);

}
=======
package com.q5.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.q5.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
	public Employee findByEmployeeName(String name);

}
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
