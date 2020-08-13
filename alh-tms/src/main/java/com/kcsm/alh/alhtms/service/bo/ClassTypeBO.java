package com.kcsm.alh.alhtms.service.bo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Description: 类类型BO
 *
 * @author chengxi
 * @since JDK 1.8
 * date: 2020/8/12 15:57
 */
public enum  ClassTypeBO {

    /**
     * 字符串
     */
    String,
    /**
     * 整形
     */
    Integer,
    /**
     * 长整形
     */
    Long,
    /**
     * 时间
     */
    LocalDateTime,
    /**
     * bigDecimal
     */
    BigDecimal,
    /**
     * bool类型
     */
    Boolean,
    /**
     * 时间类型
     */
    Date
}
