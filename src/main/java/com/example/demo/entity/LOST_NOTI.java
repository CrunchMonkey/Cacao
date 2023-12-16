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
@Entity //테이블과 매칭될 엔티티임을 나타내는 어노테이션
public class LOST_NOTI {

	@Id //pk를 나타냄
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long noti_seq;
	private String noti_kind_cd;
	private String noti_kind_nm;
	private String noti_title;
	private String noti_date;
	private String noti_content;
	
	@Builder
	public LOST_NOTI(String noti_kind_cd, String noti_kind_nm, String noti_title, String noti_date, String noti_content) {
		this.noti_kind_cd = noti_kind_cd;
		this.noti_kind_nm = noti_kind_nm;
		this.noti_kind_nm = noti_kind_nm;
		this.noti_title = noti_title;
		this.noti_date = noti_date;
		this.noti_content = noti_content;
	}

}
