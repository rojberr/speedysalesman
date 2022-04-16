package dev.drzymala.speedysalesman.algorithm.travellers;

import dev.drzymala.speedysalesman.algorithm.domain.city.City;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class GreedyCityTraveller<T> {

    private final List<City> cityList;
    private List<City> shortestPath = new ArrayList<>();

    public List<City> findShortestPath() {

        requireNotEmpty(cityList);
        shortestPath.add(0, cityList.get(0));
        cityList.remove(0);
        long size = cityList.size();

        for (int i = 0; i < size; i++) {

            City closestCity = getClosest(shortestPath.get(i), cityList);
            shortestPath.add(closestCity);
            cityList.remove(closestCity);
        }
        return shortestPath;
    }

    private void requireNotEmpty(List<City> list) {

        if (list.isEmpty() || list.size() < 2) {
            throw new IllegalArgumentException("List is not big enough! size < 2 or empty!");
        }
    }

    private City getClosest(City city, List<City> list) {

        double distance = Double.MAX_VALUE;
        City closestCity = new City(1,1, 1);

        for (City value : list) {
            if (city.distanceToCity(value) < distance) {
                distance = city.distanceToCity(value);
                closestCity = value;
            }
        }
        return closestCity;
    }
}
