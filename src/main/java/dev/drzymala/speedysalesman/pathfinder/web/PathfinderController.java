package dev.drzymala.speedysalesman.pathfinder.web;

import dev.drzymala.speedysalesman.pathfinder.application.port.SpeedyServiceUseCase;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/pathfinder")
@RestController
@AllArgsConstructor
public class PathfinderController<T> {

    private final SpeedyServiceUseCase speedyService;

    @PostMapping("/greedy")
    @ResponseStatus(HttpStatus.CREATED)
    public Object findGreedyPath(@RequestBody String data) {

        log.info("Received data " + data);
        return speedyService
                .findPath(data)
                .handle(
                        cities -> new ResponseEntity(cities, HttpStatus.OK),
                        error -> ResponseEntity.badRequest().body(error)
                );
    }

    @PostMapping("/ant")
    @ResponseStatus(HttpStatus.CREATED)
    public Object findAntPath(@RequestBody String data) {

        log.info("Received data " + data);
        return null;
    }

    @PostMapping("/generate")
    @ResponseStatus(HttpStatus.OK)
    public Object getGenerated(@RequestBody int numberOfGenerated) {

        log.info("Generating " + numberOfGenerated + " cities");
        return speedyService.generate(numberOfGenerated);
    }
}
