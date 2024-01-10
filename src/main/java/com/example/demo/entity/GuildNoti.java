package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity(name="GUILD_NOTI")
public class GuildNoti {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long notiSeq;
	
	private String notiKindCd; //공지종류코드
	private String notiKindNm; //공지종류
	private String notiTitle; //공지타이틀
	private String notiContent; //공지내용
	private String notiWrtrId; //작성자ID
	private String notiWrtrNick; //작성자닉네임
	private String notiMofiId; //수정자ID
	private String notiMofiNick; //수정자닉네임
	private String notiMofiDate; //수정일
	private String notiWrtrDate; //작성일
}
