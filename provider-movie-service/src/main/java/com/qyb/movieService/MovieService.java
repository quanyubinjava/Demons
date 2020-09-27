package com.qyb.movieService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MovieService {
    public static void main(String[] args) {
        SpringApplication.run(MovieService.class,args);
    }
}
