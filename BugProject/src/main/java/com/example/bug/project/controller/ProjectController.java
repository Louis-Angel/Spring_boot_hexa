package com.example.bug.project.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bug.project.entity.Project;

@RestController
public class ProjectController
{
	@Autowired
	IProjectService projectService;
	
	@PostMapping(value="jh")
	Long createProject(@Valid @RequestBody Project project){
		return null;		
	}
}
