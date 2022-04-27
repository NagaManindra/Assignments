<<<<<<< HEAD
package com.mvcq7.controller;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvcq7.model.Customer;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/")
	public String page() {
		return "register";
	}

	@RequestMapping(value = "/getDetails")
	public ModelAndView getdetails(@Validated @ModelAttribute("customer") Customer customer, BindingResult result) {

		Map<String, String> map = new TreeMap<>();
		map.put("Kurnool", "518001");
		map.put("Chittor", "517001");
		map.put("Kadapa", "516001");
		map.put("Anantapur", "515001");
		map.put("Amaravathi", "522020");

		if (result.hasErrors() || !customer.getZipcode().equals(map.get(customer.getCity()))) {
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
=======
package com.mvcq7.controller;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvcq7.model.Customer;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/")
	public String page() {
		return "register";
	}

	@RequestMapping(value = "/getDetails")
	public ModelAndView getdetails(@Validated @ModelAttribute("customer") Customer customer, BindingResult result) {

		Map<String, String> map = new TreeMap<>();
		map.put("Kurnool", "518001");
		map.put("Chittor", "517001");
		map.put("Kadapa", "516001");
		map.put("Anantapur", "515001");
		map.put("Amaravathi", "522020");

		if (result.hasErrors() || !customer.getZipcode().equals(map.get(customer.getCity()))) {
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
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
