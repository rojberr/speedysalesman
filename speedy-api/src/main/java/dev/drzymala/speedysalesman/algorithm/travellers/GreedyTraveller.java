package dev.drzymala.speedysalesman.algorithm.travellers;

import dev.drzymala.speedysalesman.algorithm.domain.city.City;
import dev.drzymala.speedysalesman.pathfinder.application.port.FindPathUseCase.FoundPathResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@RequiredArgsConstructor
public class GreedyTraveller<T> implements Traveller<City> {

    private final List<City> cityList;
    private List<City> shortestPath = new ArrayList<>();

    public FoundPathResponse findPath() {

        requireNotEmpty(cityList);
        shortestPath.add(0, cityList.get(0));
        cityList.remove(0);
        long size = cityList.size();
        double totalDistance = 0;
        long startTime = System.nanoTime();

        for (int i = 0; i < size; i++) {

            City closestCity = getClosest(shortestPath.get(i), cityList);
            totalDistance += getDistanceBetween(shortestPath.get(i), closestCity);
            shortestPath.add(closestCity);
            cityList.remove(closestCity);
        }
        long endTime = System.nanoTime();
        long totalTimeNano = (endTime - startTime);
        return new FoundPathResponse(totalTimeNano, totalDistance, shortestPath);
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
        return closestCity;
    }

    private double getDistanceBetween(City city1, City city2) {

        double x = Math.abs(city1.getX() - city2.getX());
        double y = Math.abs(city1.getY()) - city2.getY();
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}

