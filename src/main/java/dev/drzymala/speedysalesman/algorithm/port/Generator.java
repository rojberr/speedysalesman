package dev.drzymala.speedysalesman.algorithm.port;

import dev.drzymala.speedysalesman.algorithm.domain.City;

import java.util.List;

public interface Generator {

    List<City> generate(Long numberOfObjects);
}
