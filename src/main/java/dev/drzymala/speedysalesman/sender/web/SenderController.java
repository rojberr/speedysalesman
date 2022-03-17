package dev.drzymala.speedysalesman.sender.web;

import dev.drzymala.speedysalesman.sender.application.port.SenderUseCase;
import dev.drzymala.speedysalesman.sender.domain.User;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@AllArgsConstructor
public class SenderController {

    private final SenderUseCase sender;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.OK)
    public String doRegister(@ModelAttribute("user") User user) {
        sender.register(user.getEmail());
        return "register_success";
    }
}
