package ru.roombooking.mail.service.mail.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import ru.roombooking.mail.service.mail.MailSenderService;

@Service
@Slf4j
public class MailSenderServiceImpl implements MailSenderService {
    private final JavaMailSender mailSender;
    private final String username;

    public MailSenderServiceImpl(JavaMailSender mailSender, @Value("${spring.mail.username}") String username) {
        this.mailSender = mailSender;
        this.username = username;
    }

    @Override
    public void send(String emailTo, String subject, String message) {
        log.info("Отправка сообщения");
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(username);
        mailMessage.setTo(emailTo);
        mailMessage.setSubject(subject);
        mailMessage.setText(message);
        mailSender.send(mailMessage);
        log.info("Сообщение успешно отправлено");
    }
}