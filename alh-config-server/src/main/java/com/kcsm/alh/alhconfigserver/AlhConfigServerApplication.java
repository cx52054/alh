package com.kcsm.alh.alhconfigserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AlhConfigServerApplication {
    private static Logger logger = LoggerFactory.getLogger(AlhConfigServerApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(AlhConfigServerApplication.class, args);
        logger.info("配置中心-启动成功...");
    }

}
