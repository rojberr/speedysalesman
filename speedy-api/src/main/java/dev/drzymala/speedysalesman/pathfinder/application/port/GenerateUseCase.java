package dev.drzymala.speedysalesman.pathfinder.application.port;

import java.util.List;

public interface GenerateUseCase<T> {

    List<T> generate(int size);
}
