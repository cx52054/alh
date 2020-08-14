package com.kcsm.alh.alhorder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class AlhOrderApplication {
    private static Logger logger = LoggerFactory.getLogger(AlhOrderApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(AlhOrderApplication.class, args);
        logger.info("Order服务-启动成功...");
    }
}
