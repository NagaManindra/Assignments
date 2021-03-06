package com.example.demo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@GetMapping("/")
	public String name() {
		return "index";
	}

	@GetMapping("/hello-world")
	public ModelAndView display() {
		ModelAndView view = new ModelAndView("helloWorld");
		return view;
	}

}
