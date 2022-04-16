package dev.drzymala.speedysalesman.algorithm.domain.city;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Value
public class City {

    int id;
    int x;
    int y;

    public double distanceToCity(City city) {

        double x = Math.abs(getX() - city.getX());
        double y = Math.abs(getY() - city.getY());
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    @Override
    public String toString() {

        return "Id: " + id + " X: " + x + " Y: " + y;
    }
}
