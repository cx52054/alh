package com.kcsm.alh.alhtms.service.impl;

import com.kcsm.alh.alhtms.dao.StudentDao;
import com.kcsm.alh.alhtms.entity.Student;
import com.kcsm.alh.alhtms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Predicate;
import java.util.List;

/**
 * Description: 学生业务接口实现类
 *
 * @author chengxi
 * @since JDK 1.8
 * date: 2020/8/12 14:26
 */
@Service
public class StudentServiceImpl extends BaseServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        /*
            !!!!!!!!!!!!!!!!!!!!重点：
            这个时必须的   ·······~~~~~~~~注意哦
         */
        this.dao = studentDao;
        this.studentDao = studentDao;
    }

    @Override
    public Student insert() {
        Student student = Student.builder().name("张三").build();
        return studentDao.save(student);
    }

    @Override
    public List<Student> getAll() {
        return studentDao.findAll();
    }

    @Override
    public List<Student> findAllByGender(String gender) {
        return studentDao.findAllByGender(gender);
    }
    /**
     * 扩展基类中没有的查询条件自己的查询条件
     * @return
     */
    @Override
    public List<Predicate> createPredicateList() {
        return super.createPredicateList();
    }
}
