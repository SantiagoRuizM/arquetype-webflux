package com.pragma.archetypewebflux.module.infrastructure.input.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestCrudController {

    @GetMapping("/get")
    public ResponseEntity<?> get() {

        return null;
    }

    @PostMapping("/save")
    public ResponseEntity<?> save() {

        return null;
    }

    @PutMapping("/update")
    public ResponseEntity<?> update() {

        return null;
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> delete() {

        return null;
    }



}
