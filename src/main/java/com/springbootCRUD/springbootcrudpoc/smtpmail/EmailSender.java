package com.springbootCRUD.springbootcrudpoc.smtpmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

import java.io.UnsupportedEncodingException;

@Service
public class EmailSender {
@Autowired
private JavaMailSender mailSender;

public void sendEmail(String email, String subject, String content) throws MessagingException, UnsupportedEncodingException {
MimeMessage message = mailSender.createMimeMessage();
MimeMessageHelper helper = new MimeMessageHelper(message);

helper.setFrom("faaltu840@outlook.com", "faaltu jon");
helper.setTo(email);

helper.setSubject(subject);
helper.setText(content, true);

mailSender.send(message);
}
}