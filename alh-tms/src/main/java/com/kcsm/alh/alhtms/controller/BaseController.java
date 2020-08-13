package com.kcsm.alh.alhtms.controller;


import com.kcsm.alh.alhtms.service.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Map;

/**
 * Description: 基础controller类
 *
 * @author chengxi
 * @since JDK 1.8
 * date: 2020/8/12 16:01
 */
public class BaseController<T> {

    protected BaseService baseService;


    /**
     * 根据条件分页查询，条件拼接方式为 and
     * 条件拼接方式  xx字段_xx操作
     * @param parameters
     * @return
     */
    @GetMapping("/findAllPageByParams")
    public Page<T> findAllPageByParams(@RequestParam Map<String, String> parameters) {
        return baseService.findAllPageByParams(parameters);
    }
    /**
     * 求和数据
     * 条件同上（分页条件查询） 注意~！！！ 不需要分页属性，但是要添加统计的条件
     * 求和统计条件  xxx字段_sum = xx类型（支持BigDecimal 和 Long）
     *
     * @param params 参数
     * @return 查询条件
     */
    @GetMapping("/getSumByParams")
    public Map<String, Object> getSumByParams(@RequestParam Map<String, String> params) throws Exception {
        return baseService.getSumByParams(params);
    }
}
