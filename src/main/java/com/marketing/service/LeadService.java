package com.marketing.service;

import java.util.List;

import com.marketing.entities.Lead;

public interface LeadService {

	void savelead(Lead lead);

	public List<Lead> getallLeads();

	public void deletethis(Long id);

	public Lead findById(Long id);

}
