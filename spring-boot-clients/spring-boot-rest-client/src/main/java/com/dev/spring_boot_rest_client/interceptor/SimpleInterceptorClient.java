package com.dev.spring_boot_rest_client.interceptor;

import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class SimpleInterceptorClient {

    private final RestClient restClient;

    public SimpleInterceptorClient(RestClient.Builder builder, ClientHttpRequestInterceptor interceptorBasic) {

        this.restClient = builder
                .baseUrl("https://jsonplaceholder.typicode.com")
                .requestFactory(new JdkClientHttpRequestFactory())
                .requestInterceptor(interceptorBasic)
                .build();
    }

    public String findAll() {
        return restClient.get()
                .uri("/todos")
                .retrieve()
                .body(String.class);
    }
}
