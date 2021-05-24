package com.example.bug.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bug.project.entity.Bug;

public interface BugRepository extends JpaRepository<Bug, Long>{

}
