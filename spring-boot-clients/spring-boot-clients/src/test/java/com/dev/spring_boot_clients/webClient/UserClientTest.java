package com.dev.spring_boot_clients.webClient;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserClientTest {

    @Autowired
    private UserClient userClient;

    @Test
    void testFindAll() {
        StepVerifier.create(userClient.findAll())
                .expectNextCount(10)
                .verifyComplete();
    }

}