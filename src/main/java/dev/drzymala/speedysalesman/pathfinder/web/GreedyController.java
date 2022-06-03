package dev.drzymala.speedysalesman.pathfinder.web;

import dev.drzymala.speedysalesman.pathfinder.application.port.FindPathUseCase;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static dev.drzymala.speedysalesman.pathfinder.application.port.FindPathUseCase.FoundPathResponse;

@Slf4j
@RequestMapping("/greedy")
@RestController
public class GreedyController<T> {

    private final FindPathUseCase greedyService;

    public GreedyController(@Qualifier("greedyService") FindPathUseCase greedyService) {
        this.greedyService = greedyService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<FoundPathResponse> findGreedyPath(@RequestBody String data) {

        log.info("Received data");
        return new ResponseEntity<>(greedyService.findPath(data), HttpStatus.OK);
    }
}
