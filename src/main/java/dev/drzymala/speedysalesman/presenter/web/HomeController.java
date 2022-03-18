package dev.drzymala.speedysalesman.presenter.web;

import dev.drzymala.speedysalesman.sender.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getIndex(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "index";
    }
}
