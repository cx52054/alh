package com.kcsm.alh.alhtms.controller;
import com.kcsm.alh.alhcommon.vo.ResponseVO;
import com.kcsm.alh.alhtms.entity.Student;
import com.kcsm.alh.alhtms.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * Description: 学生Controller
 *
 * @author chengxi
 * @since JDK 1.8
 * date: 2020/8/12 14:22
 */
@RestController
@RequestMapping("/student")
public class StudentController extends BaseController{

    @Resource(name = "studentServiceImpl")
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.baseService = studentService;
        this.studentService = studentService;
    }
    /**
     * 插入学生信息
     * @return
     */
    @RequestMapping(value = "/v1/student",method = RequestMethod.POST)
    public ResponseVO<Student> insert(){
        return ResponseVO.success(studentService.insert());
    }

    /**
     * 获取所有学生信息
     * @return
     */
    @RequestMapping(value = "/v1/student",method = RequestMethod.GET)
    public ResponseVO<Student> getAll(){
        return ResponseVO.success(studentService.getAll());
    }

    /**
     * 获取所有学生信息
     * @return
     */
    @RequestMapping(value = "/v1/findAllByGender",method = RequestMethod.GET)
    public ResponseVO<Student> findAllByGender(String gender){
        return ResponseVO.success(studentService.findAllByGender(gender));
    }


}
