package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.LostNotiRepository;
import com.example.demo.entity.LostNoti;

import java.util.List;


@RestController
public class MainController {
	LostNotiRepository lostNotiRepository;
	
	@Autowired
	public MainController(LostNotiRepository lostNotiRepository) {
		this.lostNotiRepository = lostNotiRepository;
	}
	
	@RequestMapping("/hello")
	public String hello() {
		List<LostNoti> temp = lostNotiRepository.findAll();
		List<LostNoti> temp2 = lostNotiRepository.findByNotiDate("2023-12-27");
		return "hello";
	}
	

}
