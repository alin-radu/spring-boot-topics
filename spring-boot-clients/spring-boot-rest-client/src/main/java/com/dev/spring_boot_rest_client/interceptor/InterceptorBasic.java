package com.dev.spring_boot_rest_client.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class InterceptorBasic implements ClientHttpRequestInterceptor {

    private static final Logger log = LoggerFactory.getLogger(InterceptorBasic.class);

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        log.info("Intercepting request: {}", request.getURI());

        request.getHeaders().add("x-request-id", "custom-header");

        return execution.execute(request, body);
    }
}
