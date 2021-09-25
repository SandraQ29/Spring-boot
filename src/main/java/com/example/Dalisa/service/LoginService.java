package com.example.Dalisa.service;


import com.example.Dalisa.interfaz.UsuarioDAO;
import com.example.Dalisa.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class LoginService implements UsuarioDAO{
    
   
   @Autowired
    private UsuarioRepository useRepo;

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public String validarAcceso( String use, String pass) {
              
        return useRepo.logear(use, pass); 
    }

    @Override
    public void sendEmail(String form, String body) {
        SimpleMailMessage mail = new SimpleMailMessage();
            mail.setFrom(form);
            mail.setTo("Tu cuenta de socio Dalisa");
            mail.setSubject("PASSWORD:"+body);
            mail.setText(body);
            mailSender.send(mail);
    }
    
}
