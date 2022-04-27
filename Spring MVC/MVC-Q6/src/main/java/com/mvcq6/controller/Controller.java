package com.mvcq6.controller;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvcq6.model.Customer;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/")
	public String page() {
		return "register";
	}

	@RequestMapping(value = "/getDetails")
	public ModelAndView getdetails(@Validated @ModelAttribute("customer") Customer customer, BindingResult result) {

		if (result.hasErrors()) {
			ModelAndView view = new ModelAndView("register");
			return view;
		}

		ModelAndView view = new ModelAndView("result");

		view.addObject("name", customer.getUsername());
		view.addObject("pass", customer.getPassword());
		view.addObject("mail", customer.getEmail());
		view.addObject("num", customer.getContact());
		view.addObject("city", customer.getCity());
		view.addObject("code", customer.getZipcode());
		view.addObject("customer", new Customer());

		return view;
	}
}
