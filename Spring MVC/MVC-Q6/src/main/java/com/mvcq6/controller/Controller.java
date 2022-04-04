package com.mvcq6.controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvcq6.model.Customer;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/")
	public String page() {
		return "register";
	}

	@RequestMapping(value = "/getDetails", method = RequestMethod.POST)
	public String getdetails(@Validated @ModelAttribute("customer") Customer customer, BindingResult result,
			Model view) {
		if (result.hasErrors()) {
			return "register";
		}
		view.addAttribute("name", customer.getUsername());
		view.addAttribute("pass", customer.getPassword());
		view.addAttribute("mail", customer.getEmail());
		view.addAttribute("num", customer.getContact());
		view.addAttribute("city", customer.getCity());
		view.addAttribute("code", customer.getZipcode());
		view.addAttribute("customer", new Customer());
		return "result";
	}
}
