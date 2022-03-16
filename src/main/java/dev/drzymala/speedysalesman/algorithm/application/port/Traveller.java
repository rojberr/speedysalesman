package dev.drzymala.speedysalesman.algorithm.application.port;

import dev.drzymala.speedysalesman.algorithm.domain.City;

import java.util.List;

public interface Traveller {

    List<City> findPathByFindingShortest(List<City> cityList);
}
