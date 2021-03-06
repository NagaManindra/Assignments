package com.q5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.q5.model.Employee;
import com.q5.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/")
	public String form() {
		return "form";
	}

	@RequestMapping("/empform")
	public String showform(Model m) {
		m.addAttribute("command", new Employee());
		return "empform";
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(@ModelAttribute("employee") Employee employee) {
		employeeService.createEmployee(employee.getEmployeeName(), employee.getEmployeeDepartment(),
				employee.getEmployeeDesignation(), employee.getEmployeeSalary());
		return "redirect:/viewemp";
	}

	@RequestMapping("/viewemp")
	public String getAll(Model model) {
		model.addAttribute("list", employeeService.getAll());
		return "viewemp";
	}

	@RequestMapping(value = "/getbyName/{employeeName}")
	public String getbyName(@PathVariable String employeeName, Model model) {
		Employee employee = employeeService.getbyName(employeeName);
		model.addAttribute("command", employee);
		return "empeditform";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(String employeeName, String employeeDepartment, String employeeDesignation,
			long employeeSalary) {
		employeeService.update(employeeName, employeeDesignation, employeeDesignation, employeeSalary);
		return "redirect:/viewemp";
	}

	@RequestMapping("/deleteAll")
	public String deleteAll() {
		employeeService.deleteAll();
		return "redirect:/viewemp";
	}

	@RequestMapping("/deleteByName/{employeeName}")
	public String deleteByName(@PathVariable String employeeName) {
		employeeService.deleteByName(employeeName);
		return "redirect:/viewemp";
	}

}
