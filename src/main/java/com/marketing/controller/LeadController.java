package com.marketing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing.entities.Lead;
import com.marketing.service.LeadService;
import com.marketing.utility.EmailService;

@Controller
public class LeadController {
	@Autowired
	LeadService ls;
	//http://localhost:8080/create
	@Autowired
	EmailService es;
	@RequestMapping("/create")
	public String createLead() {
		return "create_lead";
	}
	
	@RequestMapping("/save")
	public String savingLead(@ModelAttribute Lead lead,ModelMap model) {
		ls.savelead(lead);
		es.sendMail(lead.getEmail(),"Welcome","hello World");
		model.addAttribute("msg", "your data was saved");
		return "create_lead";
	}
////			http://localhost:8080/listall
//	@RequestMapping("/listall")
//	public String listofdata(Model model) {
//		List<Lead> li=ls.getallLeads();
//		model.addAttribute("li", li);
//		return "list_lead";
//	}
//	
//	@RequestMapping("/delete")
//	public String delete(@RequestParam("id") Long id,Model model) {
//		ls.deletethis(id);
//		List<Lead> li=ls.getallLeads();
//		model.addAttribute("li", li);
//		return "list_lead";
//	}
//	
////	@RequestMapping("/update")
////	public String update(@RequestParam("id") Long id,Model model) {
////		Lead l=ls.findById(id);
////		model.addAttribute("lead", l);
////		return "update_page";
////	}
////	
////	@RequestMapping("/updateLead")
////	public String updating(	@RequestParam("id") Long id,
////			@RequestParam("firstName") Long firstName,
////			@RequestParam("lastName") Long lastName,
////			@RequestParam("email") Long email,
////			@RequestParam("mobile") Long mobile,
////			Model model
////		) {
////		List<Lead> li=ls.getallLeads();
////		model.addAttribute("li", li);
////		return "list_lead";
////		}
//	
//
//	
	
	
	
	
	
	
	
	
	
	
	
	
}
