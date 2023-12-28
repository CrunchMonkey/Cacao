package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor //기본생성자 생성 어노테이션
@Entity(name="LOST_NOTI") //테이블과 매칭될 엔티티임을 나타내는 어노테이션
public class LostNoti {

	@Id //pk를 나타냄
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long notiSeq;
	
	//기본적으로 @Column 장착되어있음
	private String notiKindCd;
	private String notiKindNm;
	private String notiTitle;
	private String notiDate;
	private String notiContent;
	
	@Builder
	public LostNoti(String notiKindCd, String notiKindNm, String noti_kind_nm, String notiTitle, String notiDate, String notiContent) {
		this.notiKindCd = notiKindCd;
		this.notiKindNm = notiKindNm;
		this.notiTitle = notiTitle;
		this.notiDate = notiDate;
		this.notiContent = notiContent;
	}

}
