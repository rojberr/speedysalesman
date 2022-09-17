package dev.drzymala.speedysalesman.pathfinder.application;

import dev.drzymala.speedysalesman.algorithm.domain.city.City;
import dev.drzymala.speedysalesman.pathfinder.application.port.GenerateUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Log4j2
@Service
@RequiredArgsConstructor
public class GeneratorService implements GenerateUseCase {

    @Override
    public List<City> generate(int numberOfGenerated) {

        return Stream.generate(City::new).limit(numberOfGenerated).collect(Collectors.toList());
    }
}
