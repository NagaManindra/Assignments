package com.q5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.q5.model.Employee;
import com.q5.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	// create operation
	public Employee createEmployee(String employeeName, String employeeDepartment, String employeeDesignation,
			long employeeSalary) {
		return employeeRepository
				.save(new Employee(employeeName, employeeDepartment, employeeDesignation, employeeSalary));
	};

	// Retrieve operation
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

	public Employee getbyName(String employeeName) {
		return employeeRepository.findByEmployeeName(employeeName);
	}

	// update operations
	public Employee update(String employeeName, String employeeDepartment, String employeeDesignation,
			long employeeSalary) {
		Employee e = employeeRepository.findByEmployeeName(employeeName);
		e.setEmployeeDepartment(employeeDepartment);
		e.setEmployeeDesignation(employeeDesignation);
		e.setEmployeeSalary(employeeSalary);
		return employeeRepository.save(e);
	}

	// Delete operations
	public void deleteAll() {
		employeeRepository.deleteAll();
		System.out.println("All data deleted");
	}

	public void deleteByName(String employeeName) {
		Employee e = employeeRepository.findByEmployeeName(employeeName);
		employeeRepository.delete(e);
		System.out.println("Deleted " + employeeName);
	}

}
