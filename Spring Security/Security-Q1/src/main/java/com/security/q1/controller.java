<<<<<<< HEAD
package com.security.q1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

	@GetMapping("/")
	public String helloPage() {
		return "hello";
	}

}
=======
package com.security.q1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

	@GetMapping("/")
	public String helloPage() {
		return "hello";
	}

}
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
