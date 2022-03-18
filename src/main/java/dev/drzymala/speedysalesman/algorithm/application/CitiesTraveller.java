package dev.drzymala.speedysalesman.algorithm.application;

import dev.drzymala.speedysalesman.algorithm.application.port.Traveller;
import dev.drzymala.speedysalesman.algorithm.domain.City;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;

@Slf4j
@Service
public class CitiesTraveller implements Traveller {

    @Override
    public List<City> getGreedyPath(List<City> cityList) {

        if (cityList.isEmpty()) {
            return emptyList();
        }

        List<City> path = new ArrayList<City>(cityList);
        Long distance = 0L;
        // calculate distance to each city and add the closest one
        for (int i = 0; i < cityList.size(); i++) {
            for (int j = 0; j < cityList.size(); j++) {
                if (i != j && distance <= cityList.get(i).distanceToCity(cityList.get(j))) {
                    path.set(i, cityList.get(j));
                }
            }
        }
        return path;
    }
}
