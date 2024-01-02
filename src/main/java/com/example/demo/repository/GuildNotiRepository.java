package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.GuildNoti;

@Repository
public interface GuildNotiRepository extends JpaRepository<GuildNoti, Long>{

}
