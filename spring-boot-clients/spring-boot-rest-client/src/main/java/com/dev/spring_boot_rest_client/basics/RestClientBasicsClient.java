package com.dev.spring_boot_rest_client.basics;

import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class RestClientBasicsClient {

    private final RestClient restClient;

    public RestClientBasicsClient(RestClient.Builder builder) {
        JdkClientHttpRequestFactory requestFactory = new JdkClientHttpRequestFactory();
        requestFactory.setReadTimeout(10000);

//        SimpleClientHttpRequestFactory requestFactory1 = new SimpleClientHttpRequestFactory();
//        requestFactory1.setProxy();

        this.restClient = builder
                .baseUrl("https://jsonplaceholder.typicode.com")
                .requestFactory(requestFactory)
                .build();
    }

    public String findAll() {
        return restClient.get()
                .uri("/posts")
                .retrieve()
                .body(String.class);
    }
}
