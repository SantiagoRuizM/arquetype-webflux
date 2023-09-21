package com.pragma.archetypewebflux.module.infrastructure.input.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@Controller
public class WebFluxCrudController {

    @GetMapping("/get")
    public Mono<ResponseEntity<?>> get() {

        return Mono.just(ResponseEntity.ok("Get response"));
    }

    @PostMapping("/save")
    public Mono<ResponseEntity<?>> save() {

        return Mono.just(ResponseEntity.ok("Save response"));
    }

    @PutMapping("/update")
    public Mono<ResponseEntity<?>> update() {

        return Mono.just(ResponseEntity.ok("Put response"));
    }

    @DeleteMapping("/delete")
    public Mono<ResponseEntity<?>> delete() {

        return Mono.just(ResponseEntity.ok("Delete response"));
    }



}
