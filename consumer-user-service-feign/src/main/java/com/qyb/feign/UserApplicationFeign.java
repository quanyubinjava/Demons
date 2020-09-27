package com.qyb.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableHystrixDashboard //开启可视化监控
@EnableCircuitBreaker //开启熔断
@EnableFeignClients //开启feign
@EnableEurekaClient
@SpringBootApplication
public class UserApplicationFeign {
    public static void main(String[] args) {
        SpringApplication.run(UserApplicationFeign.class,args);
    }
}
