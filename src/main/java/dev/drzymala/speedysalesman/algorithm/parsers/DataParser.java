package dev.drzymala.speedysalesman.algorithm.parsers;

import dev.drzymala.speedysalesman.algorithm.domain.city.City;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
public class DataParser {

    public List<City> readCities(String data) {

        int[] numbers = Arrays.stream(data.split("\\W+")).mapToInt(Integer::parseInt).toArray();

        List<City> cities = new ArrayList<>();
        for (int i = 1; i < numbers.length; i = i + 3) {
            cities.add(new City(numbers[i], numbers[i + 1], numbers[i + 2]));
        }
        return cities;
    }
}
