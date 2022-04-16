package dev.drzymala.speedysalesman.presenter.application;

import dev.drzymala.speedysalesman.pathfinder.application.port.SpeedyServiceUseCase;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Slf4j
@Component
@AllArgsConstructor
public class ApplicationStartup implements CommandLineRunner {

    SpeedyServiceUseCase speedyService;

    @Override
    public void run(String... args) {

        Scanner reader = new Scanner(System.in);

        System.out.printf("Do you want to use the console? yes/no");
        String yesOrNo = reader.nextLine();

        if ("no".equalsIgnoreCase(yesOrNo) || "n".equalsIgnoreCase(yesOrNo)) {
            return;
        }
    }
}
