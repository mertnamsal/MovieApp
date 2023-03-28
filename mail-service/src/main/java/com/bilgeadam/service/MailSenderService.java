package com.bilgeadam.service;

import com.bilgeadam.rabbitmq.model.EmailModel;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailSenderService {

    private final JavaMailSender javaMailSender;

    public void sendMail(EmailModel model){
        SimpleMailMessage mailMessage=new SimpleMailMessage();
        mailMessage.setFrom("${spring.mail.username}");
        mailMessage.setTo("${spring.mail.username2}");
        mailMessage.setSubject("Aktivasyon kodunuz: ");
        mailMessage.setText("252c");
        javaMailSender.send(mailMessage);
    }

}
