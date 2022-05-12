package dev.drzymala.speedysalesman.algorithm.travellers;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

public interface Traveller<T> {

    FindPathResponse findGreedyPath();

    FindPathResponse findAntPath();

    @Data
    @AllArgsConstructor
    class FindPathResponse {
        long totalTimeNano;
        double totalDistance;
        List<?> shortestPath;
    }
}
