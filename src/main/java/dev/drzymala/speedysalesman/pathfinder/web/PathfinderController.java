package dev.drzymala.speedysalesman.pathfinder.web;

import dev.drzymala.speedysalesman.pathfinder.application.port.SpeedyServiceUseCase;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/pathfinder")
@RestController
@AllArgsConstructor
public class PathfinderController<T> {

    private final SpeedyServiceUseCase speedyService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public List<T> findPath(@RequestBody String data) {

        log.info("Received data " + data);
        return speedyService.findPath(data);
    }
}
