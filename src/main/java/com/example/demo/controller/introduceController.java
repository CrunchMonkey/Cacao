package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntroduceController {
	
	@RequestMapping("/hello2")
	public String hello2() {
		return "hello";
	}
	
	//이달의 소개
	
	//이달의 이야기
	

}
