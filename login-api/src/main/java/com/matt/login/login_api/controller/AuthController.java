package com.matt.login.login_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JavaMailSender mailSender;

    @PostMapping("/send-code")
    public String sendEmail(@RequestParam String toEmail) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(toEmail);
        message.setSubject("Código de verificación");
        message.setText("Tu código es: 123456");

        mailSender.send(message);

        return "Correo enviado a " + toEmail;
    }
}