package com.kcsm.alh.alhtms.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Description: 学生实体
 *
 * @author chengxi
 * @since JDK 1.8
 * date: 2020/8/12 14:14
 */
@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "STUDENT")
public class Student {

    /**
     * 主键
     */
    @Id
    @GeneratedValue(generator = "guidGenerator")
    @GenericGenerator(name = "guidGenerator", strategy = "uuid")
    @Column(name = "ID", unique = true, nullable = false, length = 32)
    private String id;

    /**
     * 姓名
     */
    @Column
    private String name;

    /**
     * 年龄
     */
    @Column
    private Integer age;

    /**
     * 性别：male:男性，female:女性
     */
    @Column
    private String gender;

}
