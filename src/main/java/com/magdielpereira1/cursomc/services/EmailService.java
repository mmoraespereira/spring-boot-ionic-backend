package com.magdielpereira1.cursomc.services;

import org.springframework.mail.SimpleMailMessage;
import com.magdielpereira1.cursomc.domain.Pedido;

public interface EmailService {
	
  void sendOrderConfirmationEmail(Pedido obj);
  
  void sendMail(SimpleMailMessage msg); 


}
