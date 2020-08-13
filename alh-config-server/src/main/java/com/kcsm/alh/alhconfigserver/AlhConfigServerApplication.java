package com.kcsm.alh.alhconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AlhConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlhConfigServerApplication.class, args);
    }

}
