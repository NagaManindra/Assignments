<<<<<<< HEAD
package com.security.q2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {

	@GetMapping("/")
	public String helloPage() {
		return "hello";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

}
=======
package com.security.q2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {

	@GetMapping("/")
	public String helloPage() {
		return "hello";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

}
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
