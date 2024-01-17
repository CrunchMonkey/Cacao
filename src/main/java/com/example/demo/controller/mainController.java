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

import java.time.LocalDate;
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
		
		LocalDate now = LocalDate.now();
		StringBuilder nowMonth = new StringBuilder();
		
		nowMonth.append(Integer.toString(now.getYear())); //이번년도
		nowMonth.append("-"); //하이픈
		nowMonth.append(now.getMonth().toString()); //이번달
		nowMonth.append("%");
		
		List<LostNoti> list = lostNotiRepository.findByNotiDateLike(nowMonth);
		
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
	@RequestMapping("/getMonthGuildNoti")
	public JSONArray getMonthGuildNoti() {
		JSONParser jsonParser = new JSONParser();
		JSONArray jsonArr = new JSONArray();
		
		LocalDate now = LocalDate.now();
		StringBuilder nowMonth = new StringBuilder();
		
		nowMonth.append(Integer.toString(now.getYear())); //이번년도
		nowMonth.append("-"); //하이픈
		nowMonth.append(now.getMonth().toString()); //이번달
		nowMonth.append("%");
		
		List<GuildNoti> list = guildNotiRepository.findByNotiDateLike(nowMonth); //이번년도-이번달
		
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
	
	//길드소석 상세
	@SuppressWarnings("unchecked")
	@RequestMapping("/getGuildNotiDetail")
	public JSONObject getGuildNotiDetail() {
		JSONParser jsonParser = new JSONParser();
		GuildNoti temp = guildNotiRepository.findByNotiSeq((long) 1);
		
		JSONObject jsonObj = new JSONObject();
		
		jsonObj.put("notiKindCd", temp.getNotiKindCd());
		jsonObj.put("notiKindNm", temp.getNotiKindNm());
		jsonObj.put("notiTitle", temp.getNotiTitle());
		jsonObj.put("notiWrtrDate", temp.getNotiWrtrDate());
		jsonObj.put("notiContent", temp.getNotiContent());
		
		return jsonObj;
	}
	
	//길드소식 특정인이 작성한
	@RequestMapping("/getWrtrIdGuildNoti")
	public JSONArray getWrtrIdGuildNoti() {
		JSONParser jsonParser = new JSONParser();
		JSONArray jsonArr = new JSONArray();		
		
		List<GuildNoti> list = guildNotiRepository.findByNotiWrtrId("id");
		
		for(int i=0; i<list.size(); i++) {
			JSONObject temp = new JSONObject();
			
			temp.put("notiKindCd", list.get(i).getNotiKindCd());
			temp.put("notiKindNm", list.get(i).getNotiKindNm());
			temp.put("notiTitle", list.get(i).getNotiTitle());
			temp.put("NotiWrtrDate", list.get(i).getNotiWrtrDate());
			temp.put("notiContent", list.get(i).getNotiContent());
			
			jsonArr.add(temp);
		}
		return jsonArr;
	}
	

}
