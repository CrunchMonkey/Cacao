package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class introduceController {
	
	@RequestMapping("/hello")
	public String test() {
		return "hello";
	}
	
	//이달의 소개
	
	//이달의 이야기
	

}
