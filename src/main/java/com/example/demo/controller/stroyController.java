package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StroyController {
	
	@RequestMapping("/hello3")
	public String hello3() {
		return "hello3";
	}

}
