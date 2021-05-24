package com.example.bug.project.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bug.project.entity.Bug;
import com.example.bug.project.repository.BugRepository;

@Service
public class BugService
{
	@Autowired
	BugRepository bugRepository;
	
	@Transactional(rollbackOn = Exception.class, dontRollbackOn = { ArithmeticException.class,
			IllegalArgumentException.class })
	public void create(Bug bugRequest) throws Exception
	{
		System.out.println("ELEMENT "+bugRequest);
		bugRepository.save(bugRequest);
	}
}
