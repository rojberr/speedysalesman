package dev.drzymala.speedysalesman.algorithm.domain.city;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Value
public class City {

    int x;
    int y;

    public City(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceToCity(City city) {

        double x = Math.abs(getX() - city.getX());
        double y = Math.abs(getY() - city.getY());
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
