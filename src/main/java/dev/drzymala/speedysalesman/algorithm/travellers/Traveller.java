package dev.drzymala.speedysalesman.algorithm.travellers;

import dev.drzymala.speedysalesman.pathfinder.application.port.FindPathUseCase.FoundPathResponse;

public interface Traveller<T> {

    FoundPathResponse findPath();
}
