package dev.drzymala.speedysalesman.pathfinder.application;

import dev.drzymala.speedysalesman.algorithm.application.parsers.DataParser;
import dev.drzymala.speedysalesman.pathfinder.application.port.SpeedyServiceUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class SpeedySalesmanService<T> implements SpeedyServiceUseCase {


    @Override
    public FindPathResponse findPath(String data) {

        // read the data
        DataParser dataParser = new DataParser();
        List<T> cities = (List<T>) dataParser.readCities(data);

        // run the algo


        // return the calculations
        return FindPathResponse.success(cities);
    }
}
