<<<<<<< HEAD
package com.security.q4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {

	int count = 0;

	@GetMapping("/")
	public String helloPage() {
		return "hello";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/errort")
	public ModelAndView error() {
		if (count < 2) {
			count++;
			return new ModelAndView("login");
		}
		return new ModelAndView("error");
	}

}
=======
package com.security.q4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {

	int count = 0;

	@GetMapping("/")
	public String helloPage() {
		return "hello";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/errort")
	public ModelAndView error() {
		if (count < 2) {
			count++;
			return new ModelAndView("login");
		}
		return new ModelAndView("error");
	}

}
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5