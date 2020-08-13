package com.kcsm.alh.alhorder.feign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Description: 服务调用接口
 *
 * @author chengxi
 * @since JDK 1.8
 * date: 2020/8/13 14:13
 */
@FeignClient(value = "alh-tms")
public interface TmsFeign {
    @GetMapping(value = "/v1/student")
    public List<Object> getAll();
}

