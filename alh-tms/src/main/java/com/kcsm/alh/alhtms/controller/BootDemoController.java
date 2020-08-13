package com.kcsm.alh.alhtms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: bootdemoController
 *
 * @author chengxi
 * @since JDK 1.8
 * date: 2020/8/12 14:05
 */
@RestController
@RequestMapping("/")
public class BootDemoController {

    @RequestMapping("/getOk")
    private String getOk(){
    return "hello world";
    }
}
