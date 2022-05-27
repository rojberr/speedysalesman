package dev.drzymala.speedysalesman.pathfinder.web;

import dev.drzymala.speedysalesman.pathfinder.application.port.GreedyServiceUseCase;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/greedy")
@RestController
@AllArgsConstructor
public class GreedyController<T> {

    private final GreedyServiceUseCase greedyService;

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
