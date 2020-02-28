package com.celiocausjr.servicies;

import org.springframework.mail.SimpleMailMessage;

import com.celiocausjr.domain.Pedido;



public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
