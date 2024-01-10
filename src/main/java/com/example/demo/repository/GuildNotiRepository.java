package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.GuildNoti;
import com.example.demo.entity.LostNoti;

@Repository
public interface GuildNotiRepository extends JpaRepository<GuildNoti, Long>{
	//이번달 길드 소식 불러오기
	List<GuildNoti> findByNotiDate(String notiDate);
	
	//선택한 글 상세
	GuildNoti findByNotiSeq(Long notiSeq);
}
