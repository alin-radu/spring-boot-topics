package com.dev.spring_boot_rest_client.interceptor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SimpleInterceptorClientTest {

    @Autowired
    SimpleInterceptorClient simpleInterceptorClient;

    @Test
    void findAllTodos() {
        String todos = simpleInterceptorClient.findAll();
        assertNotNull(todos);
    }
}