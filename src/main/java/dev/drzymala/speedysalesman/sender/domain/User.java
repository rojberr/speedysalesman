package dev.drzymala.speedysalesman.sender.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RequiredArgsConstructor
public class User {

    private String email;
}
