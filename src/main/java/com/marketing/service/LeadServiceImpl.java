package com.marketing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketing.entities.Lead;
import com.marketing.repositories.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
	LeadRepository lr;

	@Override
	public void savelead(Lead lead) {
		lr.save(lead);
	}

	@Override
	public List<Lead> getallLeads() {
		List<Lead> findAll = lr.findAll();
		return findAll;
	}

	@Override
	public void deletethis(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Lead findById(Long id) {
		Optional<Lead>l=lr.findById(id);
		return l.get();
	}
	
}
