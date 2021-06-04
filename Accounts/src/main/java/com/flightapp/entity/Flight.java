package com.flightapp.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

//@Entity
public class Flight implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String plane;//----
	private String airline;//---
	private String fromPlace;
	private String toPlace;
	private Date startDateTime;
	private Date endDateTime;
}
