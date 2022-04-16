package dev.drzymala.speedysalesman.algorithm.generators;

import dev.drzymala.speedysalesman.algorithm.port.Generator;
import dev.drzymala.speedysalesman.algorithm.domain.City;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class CitiesGenerator implements Generator {

    @Override
    public List<City> generate(Long numberOfObjects) {
        return Stream.generate(City::new).limit(numberOfObjects).collect(Collectors.toList());
    }
}
