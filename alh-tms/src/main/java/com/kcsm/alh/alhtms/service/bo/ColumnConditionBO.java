package com.kcsm.alh.alhtms.service.bo;

import lombok.Data;

/**
 * Description: 字段，业务条件
 *
 * @author chengxi
 * @since JDK 1.8
 * date: 2020/8/12 15:52
 */
@Data
public class ColumnConditionBO {

    /**
     * 查询字段
     */
    private String column;
    /**
     * 查询条件
     */
    private Condition condition;

    public enum Condition{
        /**
         * 等于
         */
        eq,
        /**
         * like
         */
        lk,
        /**
         * start with
         * xxxxx%
         */
        sw,
        /**
         * end with
         * %xxxx
         */
        ew,
        /**
         * containing
         * %xxxxxx%
         */
        containing,
        /**
         * between
         */
        between,
        /**
         * in
         */
        in,
        /**
         * greater equal
         */
        ge,
        /**
         * great than
         */
        gt,
        /**
         * less equal
         */
        le,
        /**
         * less than
         */
        lt,
        /**
         * isNull
         */
        isNull,
        /**
         * isNotNull
         */
        isNotNull,
        /**
         * 不等于
         */
        not
    }
    public static ColumnConditionBO parse(String s){
        ColumnConditionBO columnConditionBO=new ColumnConditionBO();
        String[] strings=s.split("_");
        columnConditionBO.setColumn(strings[0]);
        columnConditionBO.setCondition(Condition.valueOf(strings[1]));
        return columnConditionBO;
    }
}
