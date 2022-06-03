package dev.drzymala.speedysalesman.pathfinder.application;

import dev.drzymala.speedysalesman.algorithm.domain.city.City;
import dev.drzymala.speedysalesman.algorithm.parsers.DataParser;
import dev.drzymala.speedysalesman.algorithm.travellers.AntTraveller;
import dev.drzymala.speedysalesman.algorithm.travellers.Traveller.FindPathResponse;
import dev.drzymala.speedysalesman.pathfinder.application.port.FindPathUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@Qualifier("antService")
@RequiredArgsConstructor
public class AntService implements FindPathUseCase {

    @Override
    public FoundPathResponse findPath(String data) {

        // read the data
        DataParser dataParser = new DataParser();
        List<City> cities = dataParser.readCities(data);

        // load the data to algo object
        AntTraveller antTraveller = new AntTraveller(cities);
        FindPathResponse result = antTraveller.startAntOptimization();

        return FoundPathResponse.success(result);
    }
}
