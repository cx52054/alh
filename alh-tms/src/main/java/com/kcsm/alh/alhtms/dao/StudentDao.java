package com.kcsm.alh.alhtms.dao;

import com.kcsm.alh.alhtms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Description: 学生数据操作接口
 *
 * @author chengxi
 * @since JDK 1.8
 * date: 2020/8/12 14:23
 */
@RepositoryRestResource(path = "student")
public interface StudentDao extends JpaRepository<Student,String>, JpaSpecificationExecutor<Student> {

    /**
     * 根据性别筛选人员
     * @Author chengxi
     * @return
     */
    @Query(value = "select * from STUDENT WHERE Gender = :gender",nativeQuery = true)
    List<Student> findAllByGender(String gender);
//
//    /**
//     * 获取学生列表
//     * @Author chengxi
//     * @return
//     */
//    List<Student> getAll();
}
