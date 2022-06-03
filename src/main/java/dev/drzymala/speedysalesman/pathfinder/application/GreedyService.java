package dev.drzymala.speedysalesman.pathfinder.application;

import dev.drzymala.speedysalesman.algorithm.domain.city.City;
import dev.drzymala.speedysalesman.algorithm.parsers.DataParser;
import dev.drzymala.speedysalesman.algorithm.travellers.CityTraveller;
import dev.drzymala.speedysalesman.pathfinder.application.port.FindPathUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@Qualifier("greedyService")
@RequiredArgsConstructor
public class GreedyService<T> implements FindPathUseCase {

    @Override
    public FoundPathResponse findPath(String data) {

        // read the data
        DataParser dataParser = new DataParser();
        List<City> cities = dataParser.readCities(data);

        // load the data to algo object
        CityTraveller greedy = new CityTraveller(cities);

        // run the algo
        return greedy.findPath();
    }
}
