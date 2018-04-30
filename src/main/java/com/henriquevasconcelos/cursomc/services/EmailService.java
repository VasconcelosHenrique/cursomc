package com.henriquevasconcelos.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.henriquevasconcelos.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
