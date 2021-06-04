package com.flightapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.entity.User;

public interface UserRepository extends JpaRepository<User, Long>
{
	
}