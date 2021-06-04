package com.flightapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController 
{
	@PostMapping(value = "/api/v1.0/flight/airline/register")
	public void sec1Test()
	{
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
