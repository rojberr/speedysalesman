package dev.drzymala.speedysalesman.algorithm.travellers;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

public interface Traveller<T> {

    FindGreedyPathResponse findGreedyPath();

    @Data
    @AllArgsConstructor
    class FindGreedyPathResponse {
        long totalTimeNano;
        double totalDistance;
        List<?> shortestPath;
    }
}
