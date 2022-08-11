package dev.drzymala.speedysalesman.algorithm.domain.ants;

import dev.drzymala.speedysalesman.algorithm.domain.city.City;

import java.util.List;

public class Ant {

    protected int trailSize;
    public int[] trail;
    protected boolean visited[];

    public Ant(int tourSize) {
        this.trailSize = tourSize;
        this.trail = new int[tourSize];
        this.visited = new boolean[tourSize];
    }

    public void visitCity(int currentIndex, int city) {
        trail[currentIndex + 1] = city;
        visited[city] = true;
    }

    public boolean visited(int i) {
        return visited[i];
    }

    public double trailLength(double graph[][], List<City> cityList) {
        double length = cityList.get(trail[0]).getDistanceTo(cityList.get(trail[trailSize - 1]));
//        double length = graph[trail[trailSize - 1]][trail[0]];
        for (int i = 0; i < trailSize - 1; i++) {
//            length += graph[trail[i]][trail[i + 1]];
            length += cityList.get(trail[i]).getDistanceTo(cityList.get(trail[i + 1]));
        }
        return length;
    }

    public void clear() {
        for (int i = 0; i < trailSize; i++)
            visited[i] = false;
    }

}
