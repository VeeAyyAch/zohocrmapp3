package com.marketing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketing.entities.Lead;
import com.marketing.repositories.LeadRepository;

//http://localhost:8080/api/leads
@RestController

@RequestMapping("/api/leads")
public class LeadRestController {
	@Autowired
	LeadRepository lr;
	
	@GetMapping
	public List<Lead> getLeads(){
		List<Lead>lead=lr.findAll();
		return lead;
	}
	@PostMapping
	public void post(@RequestBody Lead lead) {
		lr.save(lead);
	}
	
	@PutMapping("/{id}")
	public void update(@RequestBody Lead lead,@PathVariable("id") Long id) {
		
	}
}
