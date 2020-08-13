package com.kcsm.alh.alhorder.controller;
import com.kcsm.alh.alhorder.feign.TmsFeign;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description: Tms控制层
 *
 * @author chengxi
 * @since JDK 1.8
 * date: 2020/8/13 14:12
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private TmsFeign tmsFeign;
    @RequestMapping("/getAll")
    public List<Object> csinfo(){
        return tmsFeign.getAll();
    }

}
