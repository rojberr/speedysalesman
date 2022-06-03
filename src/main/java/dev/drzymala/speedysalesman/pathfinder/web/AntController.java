package dev.drzymala.speedysalesman.pathfinder.web;

import dev.drzymala.speedysalesman.pathfinder.application.port.FindPathUseCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/pathfinder/ant")
@RestController
public class AntController {

    private final FindPathUseCase antService;

    public AntController(@Qualifier("antService") FindPathUseCase antService) {
        this.antService = antService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Object findAntPath(@RequestBody String data) {

        log.info("Received data " + data);
        return antService.findPath(data);
    }

}
