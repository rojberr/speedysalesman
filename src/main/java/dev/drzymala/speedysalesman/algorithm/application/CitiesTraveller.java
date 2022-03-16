package dev.drzymala.speedysalesman.algorithm.application;

import dev.drzymala.speedysalesman.algorithm.application.port.Traveller;
import dev.drzymala.speedysalesman.algorithm.domain.City;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Collections.emptyList;

@Service
public class CitiesTraveller implements Traveller {

    @Override
    public List<City> findPathByFindingShortest(List<City> cityList) {

        if (cityList.isEmpty()) {
            return emptyList();
        }
        return emptyList();
//        List<City> path = new ArrayList<>();
//        // calculate distance to each city and add the closest one
//        cityList.forEach(cityA -> {
//            AtomicLong counter = new AtomicLong(0);
//            cityList
//                    .forEach(cityB -> {
//                        Double distance = 0.0;
//                        if (cityA.distanceToCity(cityB) >= distance) {
//                            counter.incrementAndGet();
//                            distance = cityA.distanceToCity(cityB);
//                        }
//                    });
//            path.add(closestCity[0]);
//        });
//        return path;
    }
}
