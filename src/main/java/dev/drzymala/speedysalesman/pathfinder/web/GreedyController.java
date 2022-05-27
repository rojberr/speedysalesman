package dev.drzymala.speedysalesman.pathfinder.web;

import dev.drzymala.speedysalesman.pathfinder.application.port.FindPathUseCase;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public Object findGreedyPath(@RequestBody String data) {

        log.info("Received data " + data);
        return greedyService
                .findPath(data)
                .handle(
                        cities -> new ResponseEntity(cities, HttpStatus.OK),
                        error -> ResponseEntity.badRequest().body(error)
                );
    }
}
