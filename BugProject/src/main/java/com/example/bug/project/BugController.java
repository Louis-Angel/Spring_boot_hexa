package com.example.bug.project;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bug.project.entity.Bug;
import com.example.bug.project.service.BugService;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin
public class BugController
{
	@Autowired
	BugService bugService;
	
	@GetMapping(value = "/bug")
	public void getAllBug()
	{
		System.out.println("GET REQ BUG");
	}
	
	@PostMapping(value = "/bug")
	@ApiOperation(consumes = "application/json", value = "create Bug")
	public void createBug(@Valid @RequestBody Bug bugRequest) throws Exception
	{
		System.out.println(bugRequest.getDescription());
		System.out.println(bugRequest.getCreateDate());
		bugService.create(bugRequest);
	}
	
	@PutMapping(value = "/bug/{id}")
	public void updateBug(@RequestBody Bug bugRequest, @PathVariable Long id)
	{
		
	} 
	
	@DeleteMapping(value = "/bug/{id}")
	public void deleteBug(@RequestBody Bug bugRequest, @PathVariable Long id) 
	{
		
	}
}
