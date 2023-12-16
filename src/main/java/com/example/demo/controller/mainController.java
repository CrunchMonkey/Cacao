package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.LOST_NOTI;
import com.example.demo.entity.LOST_NOTIRepository;
import org.junit.After;
import org.junit.Test;

@RestController
public class mainController {
	LOST_NOTIRepository lostNotiRepository;
	
	@Autowired
	public mainController(LOST_NOTIRepository lostNotiRepository) {
		this.lostNotiRepository = lostNotiRepository;
	}
	
	@After //Junit에서 단위 테스트가 끝날 때마다 수행되는 메소드
	public void cleanUp() {
		lostNotiRepository.deleteAll();
	}
	
	@Test
	public void test() {
		lostNotiRepository.save(LOST_NOTI.builder().noti_kind_cd("dd").build());
	}
	
	@RequestMapping("/hello")
	public String test1() {
		return "hello";
	}
	

}
