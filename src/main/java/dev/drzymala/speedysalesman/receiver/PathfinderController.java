package dev.drzymala.speedysalesman.receiver;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/pathfinder")
@RestController
@AllArgsConstructor
public class PathfinderController {

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void findPath(@RequestBody String data) {

        log.info("Received data " + data);
        System.out.print(data);
    }
}
