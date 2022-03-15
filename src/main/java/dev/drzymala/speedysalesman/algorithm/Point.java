package dev.drzymala.speedysalesman.algorithm;

import lombok.Value;

@Value
public class Point {

    private Long x;
    private Long y;

    public double distanceToPoint(Point point) {

        Long x = Math.abs(getX() - point.getX());
        Long y = Math.abs(getY() - point.getY());
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
