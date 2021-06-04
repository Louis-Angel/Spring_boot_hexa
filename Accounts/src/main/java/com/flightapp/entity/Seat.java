package com.flightapp.entity;

import java.io.Serializable;

public class Seat implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String seatNumber;
	private String lastName;
	private String email;
	private String role;
	private Discount discount;
	
}