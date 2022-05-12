package dev.drzymala.speedysalesman.pathfinder.application;

import dev.drzymala.speedysalesman.algorithm.domain.city.City;
import dev.drzymala.speedysalesman.algorithm.parsers.DataParser;
import dev.drzymala.speedysalesman.algorithm.travellers.CityTraveller;
import dev.drzymala.speedysalesman.pathfinder.application.port.SpeedyServiceUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static dev.drzymala.speedysalesman.algorithm.travellers.Traveller.FindGreedyPathResponse;
import static dev.drzymala.speedysalesman.pathfinder.application.port.SpeedyServiceUseCase.FindPathResponse.success;

@Log4j2
@Service
@RequiredArgsConstructor
public class SpeedySalesmanService<T> implements SpeedyServiceUseCase {

    @Override
    public FindPathResponse findPath(String data) {

        // read the data
        DataParser dataParser = new DataParser();
        List<City> cities = dataParser.readCities(data);

        // load the data to algo object
        CityTraveller greedy = new CityTraveller(cities);

        // run the algo
        FindGreedyPathResponse result = greedy.findGreedyPath();
        return success(result);
    }

    @Override
    public List<City> generate(int numberOfGenerated) {

        return Stream.generate(City::new).limit(numberOfGenerated).collect(Collectors.toList());
    }
}
