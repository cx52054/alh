package com.kcsm.alh.alhtms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlhTmsApplication {
    private static Logger logger = LoggerFactory.getLogger(AlhTmsApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(AlhTmsApplication.class, args);
        logger.info("Tms服务-启动成功...");
    }

}
