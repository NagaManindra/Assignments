package com.q5.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping
public class Security {
	@RequestMapping("/")
	public String hello() {
		return "hello-world";
	}

	@RequestMapping("/login")
	public ModelAndView loginPage() {
		ModelAndView view = new ModelAndView("index");
		return view;
	}
}
