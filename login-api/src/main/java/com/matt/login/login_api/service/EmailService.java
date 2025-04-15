package com.matt.login.login_api.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender mailSender;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void enviarCorreo(String destino, String asunto, String cuerpo) {
        SimpleMailMessage mensaje = new SimpleMailMessage();
        mensaje.setTo(destino);           
        mensaje.setSubject(asunto);       
        mensaje.setText(cuerpo);         
        mensaje.setFrom("1234567@gmail.com");

        mailSender.send(mensaje);         // Lo manda
    }
}
