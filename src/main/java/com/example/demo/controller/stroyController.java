package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class stroyController {
	
	@RequestMapping("/hello")
	public String test() {
		return "hello";
	}

}
