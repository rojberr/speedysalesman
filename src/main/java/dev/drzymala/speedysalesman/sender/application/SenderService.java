package dev.drzymala.speedysalesman.sender.application;

import dev.drzymala.speedysalesman.sender.application.port.SenderUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SenderService implements SenderUseCase {

    @Override
    public void register(String email) {
        System.out.println(email);
    }
}
