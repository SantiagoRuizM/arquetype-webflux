package com.pragma.archetypewebflux.module.infrastructure.input.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class WebFluxCrudServiceClient {

    private final WebClient webClient;

    public WebFluxCrudServiceClient(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<ResponseEntity<?>> get() {
        return null;
    }

    public Mono<ResponseEntity<?>> post() {
        return null;
    }

    public Mono<ResponseEntity<?>> put() {
        return null;
    }

    public Mono<ResponseEntity<?>> delete() {
        return null;
    }



}
