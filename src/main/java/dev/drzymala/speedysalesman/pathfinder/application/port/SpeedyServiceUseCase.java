package dev.drzymala.speedysalesman.pathfinder.application.port;

import java.util.List;

public interface SpeedyServiceUseCase<T> {

    List<T> findPath(String data);
}
