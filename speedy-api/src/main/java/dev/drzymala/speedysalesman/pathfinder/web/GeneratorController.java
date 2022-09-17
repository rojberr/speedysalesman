package dev.drzymala.speedysalesman.pathfinder.web;

import dev.drzymala.speedysalesman.pathfinder.application.port.GenerateUseCase;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RequestMapping("/pathfinder/generate")
@RestController
@AllArgsConstructor
public class GeneratorController {

    private final GenerateUseCase generatorService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Object getGenerated(@RequestBody int numberOfGenerated) {

        log.info("Generating " + numberOfGenerated + " cities");
        return generatorService.generate(numberOfGenerated);
    }
}
