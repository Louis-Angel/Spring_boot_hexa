package com.flightapp.entity;

import java.io.Serializable;

public class Airline implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String contactNumber;
	private String flight;//-------------
	private String writeup;
	private Boolean blocked;
}
