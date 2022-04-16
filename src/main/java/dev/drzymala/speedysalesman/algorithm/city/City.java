package dev.drzymala.speedysalesman.algorithm.city;

import lombok.Value;

@Value
public class City {

    Long DIGIT = 0L;
    Long BOUND = 900000L;
    int x;
    int y;

    public City(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceToCity(dev.drzymala.speedysalesman.algorithm.domain.City city) {

        double x = Math.abs(getX() - city.getX());
        double y = Math.abs(getY() - city.getY());
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
