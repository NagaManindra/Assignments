package com.q4.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.q4.model.User;
import com.q4.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	ModelAndView view;

	@GetMapping("/")
	public ModelAndView mainPage() {
		view = new ModelAndView("page");
		return view;
	}

	@GetMapping("/register")
	public ModelAndView register() {
		view = new ModelAndView("register");
		return view;
	}

	@GetMapping("/login")
	public ModelAndView login() {
		view = new ModelAndView("page");
		return view;
	}

	@PostMapping("/create")
	public ModelAndView create(@Valid @ModelAttribute("reg") User user, Errors result) {
		if (result.hasErrors()) {
			view = new ModelAndView("register");
			return view;
		}
		service.create(user.getUsername(), user.getPassword(), user.getEmail());
		view = new ModelAndView("regSuccess");
		return view;
	}

	@GetMapping("/check")
	public ModelAndView check(@ModelAttribute("login") User user) {
		/*
		 * if (service.find(user.getUsername(), user.getPassword()) == true) { view =
		 * new ModelAndView("Success"); return view; } else { view = new
		 * ModelAndView("error"); return view; }
		 */
		boolean v = service.find(user.getUsername(), user.getPassword());
		if (v == true) {
			view = new ModelAndView("success");
			return view;
		}
		view = new ModelAndView("error");
		return view;
	}
}
