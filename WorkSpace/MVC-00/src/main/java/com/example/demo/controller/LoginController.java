package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

import com.example.demo.login.Login;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/loginform")
	public String loginPage(@RequestAttribute Login login) {
		return "success";
	}

}
