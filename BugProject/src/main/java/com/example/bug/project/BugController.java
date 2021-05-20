package com.example.bug.project;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.bug.project.entity.Bug;

@RestController
public class BugController
{
	@RequestMapping(method=RequestMethod.POST, value = "/bugNew")
	public void createBug(@RequestBody Bug bug)
	{
		System.out.println(bug.getDescription());
		System.out.println(bug.getAttachedFiles());
		System.out.println(bug.getCreateDate());
	}
}
