package com.github.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class ZuulGetwayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGetwayApplication.class, args);
    }
}
