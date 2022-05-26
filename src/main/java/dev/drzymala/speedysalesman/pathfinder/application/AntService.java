package dev.drzymala.speedysalesman.pathfinder.application;

import dev.drzymala.speedysalesman.pathfinder.application.port.AntServiceUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AntService implements AntServiceUseCase {

    @Override
    public OptimalPathResponse findPath(String data) {
        return null;
    }

    @Override
    public List generate(int size) {
        return null;
    }
}
