package dev.drzymala.speedysalesman.pathfinder.application;

import dev.drzymala.speedysalesman.pathfinder.application.port.SpeedyServiceUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class SpeedySalesmanService implements SpeedyServiceUseCase {


    @Override
    public List findPath(String data) {
        return null;
    }
}
