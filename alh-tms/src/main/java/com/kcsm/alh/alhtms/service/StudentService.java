package com.kcsm.alh.alhtms.service;


import com.kcsm.alh.alhtms.entity.Student;

import java.util.List;

/**
 * Description: 学生业务接口类
 *
 * @author chengxi
 * @since JDK 1.8
 * date: 2020/8/12 14:27
 */
public interface StudentService extends BaseService{
    /**
     * 插入学生信息
     * @Author chengxi
     * @return
     */
    Student insert();

    /**
     * 获取学生列表
     * @Author chengxi
     * @return
     */
    List<Student> getAll();

    /**
     * 根据性别筛选学生
     * @param gender
     * @return
     */
    List<Student> findAllByGender(String gender);
}
