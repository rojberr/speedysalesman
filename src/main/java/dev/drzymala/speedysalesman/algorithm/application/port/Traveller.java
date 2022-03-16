package dev.drzymala.speedysalesman.algorithm.application.port;

import dev.drzymala.speedysalesman.algorithm.domain.City;
import dev.drzymala.speedysalesman.algorithm.domain.CityRepository;

import java.util.List;

public interface Traveller {

    List<City> getGreedyPath(List<City> cityList);
}
