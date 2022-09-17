package dev.drzymala.speedysalesman.pathfinder.application.port;

import java.util.List;

public interface FindPathUseCase<T> {

    FoundPathResponse findPath(String data);


    record FoundPathResponse<T>(long totalTimeNano,
                                double totalDistance,
                                List<T> calculatedPath) {
    }
}
