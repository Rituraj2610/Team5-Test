package com.team_test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class AshuController {
	
	@GetMapping("/ashu")
	public String sayHello() {
		return "Hey I am ashu !";
	}
}
