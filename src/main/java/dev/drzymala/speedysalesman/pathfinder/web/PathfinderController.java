package dev.drzymala.speedysalesman.pathfinder.web;

import dev.drzymala.speedysalesman.pathfinder.application.port.SpeedyServiceUseCase;
import dev.drzymala.speedysalesman.whatever.city.City;
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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Object findPath(@RequestBody String data) {

        log.info("Received data " + data);
//        return speedyService
//                .findPath(data)
//                .handle(
//                        cities -> ResponseEntity.ok().build(),
//                        error -> ResponseEntity.internalServerError().build()
//                );
        return new ResponseEntity<Object>("hehe", HttpStatus.OK);
    }
}
