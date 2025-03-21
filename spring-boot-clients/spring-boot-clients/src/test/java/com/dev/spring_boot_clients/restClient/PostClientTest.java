package com.dev.spring_boot_clients.restClient;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PostClientTest {

    @Autowired
    private PostClient postClient;

    @Test
    void testFindAll() {
        List<Post> posts = postClient.findAll();
        assertEquals(100, posts.size());
    }

}