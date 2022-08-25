package com.bosonit.DB1JpaDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
    @GetMapping
    public String getHola() {
        return "Hola";
    }
}
