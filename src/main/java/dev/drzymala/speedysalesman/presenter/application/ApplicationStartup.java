package dev.drzymala.speedysalesman.presenter.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartup implements CommandLineRunner {

    public ApplicationStartup() {

    }

    @Override
    public void run(String... args) {

        System.out.println("Hello world");
    }
}
