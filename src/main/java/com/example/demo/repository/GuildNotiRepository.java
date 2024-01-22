package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.GuildNoti;
import com.example.demo.entity.LostNoti;

@Repository
public interface GuildNotiRepository extends JpaRepository<GuildNoti, Long>{
	//이번달 길드 소식 불러오기
	List<GuildNoti> findByNotiWrtrDateLike(String notiWrtrDate);
	
	//선택한 글 상세
	GuildNoti findByNotiSeq(Long notiSeq);
	
	//특정 유저가 작성한 글목록
	List<GuildNoti> findByNotiWrtrId(String notiWrtrId);
	
	//내용이 포함된 작성한 글목록
	List<GuildNoti> findByNotiContentLike(StringBuilder notiContent);
}
