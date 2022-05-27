package dev.drzymala.speedysalesman.pathfinder.web;

import dev.drzymala.speedysalesman.pathfinder.application.port.GreedyServiceUseCase;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RequestMapping("/generate")
@RestController
@AllArgsConstructor
public class GeneratorController {

    private final GreedyServiceUseCase greedyService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Object getGenerated(@RequestBody int numberOfGenerated) {

        log.info("Generating " + numberOfGenerated + " cities");
        return greedyService.generate(numberOfGenerated);
    }
}
