package com.kcsm.alh.alheurekaserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
@RestController
public class AlhEurekaServerApplication {
    private static Logger logger = LoggerFactory.getLogger(AlhEurekaServerApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(AlhEurekaServerApplication.class, args);
        logger.info("eureka注册服务中心-启动成功...");
    }

    /**
     * @description 检查当前使用的是哪个远程配置文件
     *
     * @return [String]配置文件名称
     * @author chengxi
     * @date 2019/06/19
     */
    @Value("${csinfo}")
    String csinfo;
    @RequestMapping(value = "/csinfo")
    public String hi(){
        return csinfo;
    }

}
