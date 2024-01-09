package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.GuildNoti;
import com.example.demo.entity.LostNoti;

@Repository
public interface GuildNotiRepository extends JpaRepository<GuildNoti, Long>{
	List<GuildNoti> findByNotiDate(String notiDate);
}
