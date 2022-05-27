package dev.drzymala.speedysalesman.pathfinder.application;

import dev.drzymala.speedysalesman.algorithm.domain.city.City;
import dev.drzymala.speedysalesman.algorithm.parsers.DataParser;
import dev.drzymala.speedysalesman.algorithm.travellers.AntTraveller;
import dev.drzymala.speedysalesman.pathfinder.application.port.AntServiceUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AntService implements AntServiceUseCase {

    @Override
    public OptimalPathResponse findPath(String data) {

        // read the data
        DataParser dataParser = new DataParser();
        List<City> cities = dataParser.readCities(data);

        // load the data to algo object
        AntTraveller antTraveller = new AntTraveller(cities);
        antTraveller.startAntOptimization();


        AntTraveller antColony = new AntTraveller(21);
        antColony.startAntOptimization();
        return null;
    }
}
