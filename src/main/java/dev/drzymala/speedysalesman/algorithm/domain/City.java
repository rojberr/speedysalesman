package dev.drzymala.speedysalesman.algorithm.domain;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.Random;

@Slf4j
@Value
@Repository
public class City {

    Long DIGIT = 0L;
    Long BOUND = 900000L;
    Long x;
    Long y;

    public City() {
        this.x = new Random().nextLong(BOUND) + DIGIT;
        this.y = new Random().nextLong(BOUND) + DIGIT;
    }

    public City(Long x, Long y) {
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
