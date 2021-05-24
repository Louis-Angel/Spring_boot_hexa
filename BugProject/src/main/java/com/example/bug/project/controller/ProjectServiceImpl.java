package com.example.bug.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bug.project.entity.Project;
import com.example.bug.project.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements IProjectService
{

	@Autowired
	ProjectRepository projectRepository;
	
	@Override
	public Long createProject(Project project)
	{
		Project project2 = projectRepository.save(project);
		return project2.getId();
	}

}
