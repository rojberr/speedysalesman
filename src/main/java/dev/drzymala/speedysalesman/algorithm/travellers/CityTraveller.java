package dev.drzymala.speedysalesman.algorithm.travellers;

import dev.drzymala.speedysalesman.algorithm.domain.city.City;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Getter
public class CityTraveller<T> implements Traveller<City> {

    private final List<City> cityList;
    private List<City> shortestPath = new ArrayList<>();
    private double totalDistance = 0.0;

    public List<City> findGreedyPath() {

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
        City closestCity = new City(1, 1, 1);

        for (City currentCity : list) {
            if (getDistanceBetween(city, currentCity) < distance) {
                distance = getDistanceBetween(city, currentCity);
                closestCity = currentCity;
            }
        }
        totalDistance = totalDistance + getDistanceBetween(city, closestCity);
        return closestCity;
    }

    private double getDistanceBetween(City city1, City city2) {

        double x = Math.abs(city1.getX() - city2.getX());
        double y = Math.abs(city1.getY()) - city2.getY();
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
