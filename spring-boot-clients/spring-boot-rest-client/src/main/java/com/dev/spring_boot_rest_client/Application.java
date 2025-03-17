package com.dev.spring_boot_rest_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // used by RestClientBasicsClient;
        System.setProperty("jdk.httpclient.HttpClient.log", "all");

        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(RestClientBasicsClient restClientBasicsClient) {
//        return args -> {
//            String posts = restClientBasicsClient.findAll();
//            System.out.println(posts);
//        };
//    }

}
