package com.matt.login.login_api.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender mailSender;

    // Inyectamos el componente que sabe enviar mails
    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void enviarCorreo(String destino, String asunto, String cuerpo) {
        SimpleMailMessage mensaje = new SimpleMailMessage();
        mensaje.setTo(destino);           
        mensaje.setSubject(asunto);       
        mensaje.setText(cuerpo);         
        mensaje.setFrom("matybidartebolsoo@gmail.com");

        mailSender.send(mensaje);         // Lo manda
    }
}
