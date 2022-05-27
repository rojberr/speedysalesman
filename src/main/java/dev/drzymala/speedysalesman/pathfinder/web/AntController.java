package dev.drzymala.speedysalesman.pathfinder.web;

import dev.drzymala.speedysalesman.pathfinder.application.port.AntServiceUseCase;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/ant")
@RestController
@AllArgsConstructor
public class AntController {

    private final AntServiceUseCase antService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Object findAntPath(@RequestBody String data) {

        log.info("Received data " + data);
        return antService.findPath(data);
    }

}
