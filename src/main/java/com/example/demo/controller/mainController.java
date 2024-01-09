package com.example.demo.controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.GuildNotiRepository;
import com.example.demo.repository.LostNotiRepository;
import com.example.demo.entity.GuildNoti;
import com.example.demo.entity.LostNoti;

import java.util.List;


@RestController
public class MainController {
	LostNotiRepository lostNotiRepository;
	GuildNotiRepository guildNotiRepository;
	
	@Autowired
	public MainController(LostNotiRepository lostNotiRepository, GuildNotiRepository guildNotiRepository) {
		this.lostNotiRepository = lostNotiRepository;
		this.guildNotiRepository = guildNotiRepository;
	}
	
	//이번달 로스트아크 소식
	@SuppressWarnings("unchecked")
	@RequestMapping("/getMonthLostArkNoti")
	public JSONArray getMonthLostArkNoti() {
		JSONParser jsonParser = new JSONParser();
		JSONArray jsonArr = new JSONArray();
		List<LostNoti> list = lostNotiRepository.findByNotiDate("2023-12-27");
		
		for(int i=0; i<list.size(); i++) {
			JSONObject temp = new JSONObject();
			
			temp.put("notiKindCd", list.get(i).getNotiKindCd());
			temp.put("notiKindNm", list.get(i).getNotiKindNm());
			temp.put("notiTitle", list.get(i).getNotiTitle());
			temp.put("notiDate", list.get(i).getNotiDate());
			temp.put("notiContent", list.get(i).getNotiContent());
			
			jsonArr.add(temp);
		}
		return jsonArr;
	}
	
	//이번달 길드 소식
	@SuppressWarnings("unchecked")
	@RequestMapping("/getMonthLostArkNoti")
	public JSONArray getMonthGuildNoti() {
		JSONParser jsonParser = new JSONParser();
		JSONArray jsonArr = new JSONArray();
		List<GuildNoti> list = guildNotiRepository.findByNotiDate("2023-12-27");
		
		for(int i=0; i<list.size(); i++) {
			JSONObject temp = new JSONObject();
			
			temp.put("notiKindCd", list.get(i).getNotiKindCd());
			temp.put("notiKindNm", list.get(i).getNotiKindNm());
			temp.put("notiTitle", list.get(i).getNotiTitle());
			temp.put("notiWrtrDate", list.get(i).getNotiWrtrDate());
			temp.put("notiContent", list.get(i).getNotiContent());
			
			jsonArr.add(temp);
		}
		return jsonArr;
	}
	

}
