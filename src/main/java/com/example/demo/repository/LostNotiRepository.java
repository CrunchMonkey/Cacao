package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.LostNoti;

@Repository
public interface LostNotiRepository  extends JpaRepository<LostNoti, Long>{//연결한 엔티티<이름, pk 변수형>
//	public List<testEntity> findBy
//	save() / 데이터저장
//	findOne(기본키 매개변수) / 기본키로 데이터 찾기
//	findAll() / 모든 데이터 불러오기
	
	//이번달 로스트아크 소식 불러오기
	List<LostNoti> findByNotiDate(String notiDate);
	//이번달 길드 소식 불러오기
	
}
