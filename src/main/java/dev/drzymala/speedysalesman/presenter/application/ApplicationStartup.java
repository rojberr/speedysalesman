package dev.drzymala.speedysalesman.presenter.application;

import dev.drzymala.speedysalesman.algorithm.port.Generator;
import dev.drzymala.speedysalesman.algorithm.port.Traveller;
import dev.drzymala.speedysalesman.algorithm.domain.CityRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class ApplicationStartup implements CommandLineRunner {

    private final Generator generator;
    private final Traveller traveller;
    private final CityRepository cityList;

    @Override
    public void run(String... args) {

        cityList.save(generator.generate(3L));
        System.out.println(cityList);

        System.out.println(traveller.getGreedyPath(cityList.listAll()));
    }
}
