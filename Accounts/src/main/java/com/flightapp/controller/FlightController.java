package com.flightapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.entity.User;
import com.flightapp.service.UserService;

@RestController
public class FlightController 
{
	@Autowired
	UserService userService;
	
	@PostMapping(value = "/api/v1.0/flight/airline/register")
	public void sec1Test(@RequestBody User user)
	{
		userService.newUser(user);
		System.out.println("----- REGISTER -----");
	}
	
	@PostMapping(value = "/api/v1.0/flight/search")
	public void sec2Test()
	{
		System.out.println("----- SEARCH -----");
	}
	
	@PostMapping(value = "/api/v1.0/flight/airline/inventory/add")
	public void sec3Test()
	{
		System.out.println("----- ADD -----");
	}
	
	@PostMapping(value = "/api/v1.0/flight/admin/login")
	public void sec4Test()
	{
		System.out.println("----- LOGIN -----");
	}
}
