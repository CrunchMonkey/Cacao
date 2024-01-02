package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity(name="GUILD_NOTI")
public class GuildNoti {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long notiSeq;
	private String notiKindCd;
	private String notiKindNm;
	private String notiTitle;
	private String notiContent;
	private String notiWrtrId;
	private String notiWrtrNick;
	private String notiMofiId;
	private String notiMofiNick;
	private String notiMofiDate;
	private String notiWrtrDate;
}
