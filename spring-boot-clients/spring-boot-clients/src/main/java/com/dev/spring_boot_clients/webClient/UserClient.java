package com.dev.spring_boot_clients.webClient;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Component
public class UserClient {

    private final WebClient webClient;

    public UserClient(WebClient.Builder builder) {
        this.webClient = builder
                .baseUrl("https://jsonplaceholder.typicode.com")
                .build();
    }

    // async request
    public Flux<User> findAll() {
        return webClient.get()
                .uri("/users")
                .retrieve()
                .bodyToFlux(User.class);
    }

    // sync request
    public User finOne() {
        return webClient.get()
                .uri("/users/1")
                .retrieve()
                .bodyToMono(User.class)
                .block();
    }
}
