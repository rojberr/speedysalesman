package dev.drzymala.speedysalesman.algorithm.domain.city;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Value
public class City {

    int id;
    int x;
    int y;

    @Override
    public String toString() {

        return "Id: " + id + " X: " + x + " Y: " + y;
    }
}
