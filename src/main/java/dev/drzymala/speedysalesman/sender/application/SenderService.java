package dev.drzymala.speedysalesman.sender.application;

import dev.drzymala.speedysalesman.sender.application.port.SenderUseCase;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class SenderService implements SenderUseCase {

    private final JavaMailSender mailSender;

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void register(String email) {
        log.info("Sending register email");
        sendSimpleMessage(email);
    }

    public void sendSimpleMessage(String to) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("noreply@speedysalesman.com");
        message.setTo(to);
        message.setSubject("Welcome to Speedysalesman mailing list!");
        message.setText(
                "Welcome to our mailing list! ciasto xxx"
        );
        javaMailSender.send(message);
    }
}
