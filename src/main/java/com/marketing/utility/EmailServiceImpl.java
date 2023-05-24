package com.marketing.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {
	@Autowired
	JavaMailSender jms;

	@Override
	public void sendMail(String email, String string, String string2) {
		SimpleMailMessage sm=new SimpleMailMessage();
		sm.setTo(email);
		sm.setSubject(string);
		sm.setText(string2);
		jms.send(sm);
	}
	
}
