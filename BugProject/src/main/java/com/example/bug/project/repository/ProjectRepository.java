package com.example.bug.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bug.project.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>
{

}
