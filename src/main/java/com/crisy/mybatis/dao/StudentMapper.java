package com.crisy.mybatis.dao;


import com.crisy.mybatis.pojo.Student;

import java.util.List;

/**
 * 学生
 */
public interface StudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer sno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated
     */
    int insert(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated
     */
    int insertSelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated
     */
    Student selectByPrimaryKey(Integer sno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Student record);

    /**
     * 查询所有用户
     * @return
     */
    List<Student> findAllStudent();

    /**
     * 根据ID查找用户
     * @param sno
     * @return
     */
    Student findById(Integer sno);

    /**
     * 根据姓名模糊查询
     */
    Student findByName(String name);

    /**
     * 分页查询
     */
    List<Student> findPage(Student student,int pageStart,int pageSize);

    /**
     * 新增数据
     */
    int insertData(Student student);

    /**
     * 更新数据
     */
    int update(Student student);
}