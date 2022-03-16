package dev.drzymala.speedysalesman.algorithm.domain;

import java.util.List;

public interface CityRepository {

    List<City> listAll();

    void clean();

    void save(List<City> generate);
}
