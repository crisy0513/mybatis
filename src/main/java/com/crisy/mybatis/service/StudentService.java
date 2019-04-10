package com.crisy.mybatis.service;

import com.crisy.mybatis.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findByid(Integer id);
    Student findByName(String name);
    List<Student> findPage(Student student,int pageIndex,int pageSize);
    int insert(Student student);
    int update(Student student);

    int transaction(Student student);
}
