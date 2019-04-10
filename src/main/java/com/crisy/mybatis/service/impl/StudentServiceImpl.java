package com.crisy.mybatis.service.impl;

import com.crisy.mybatis.dao.StudentMapper;
import com.crisy.mybatis.pojo.Student;
import com.crisy.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAll() {
        return studentMapper.findAllStudent();
    }

    @Override
    public Student findByid(Integer id) {
        return studentMapper.findById(id);
    }

    @Override
    public Student findByName(String name) {
        return studentMapper.findByName(name);
    }

    @Override
    public List<Student> findPage(Student student ,int pageIndex, int pageSize) {
        int pageStart = 0;
        if(pageIndex != 1){
            pageStart = (pageIndex-1)*pageSize;
        }
        return studentMapper.findPage(student,pageStart,pageSize);
    }

    @Override
    public int insert(Student student) {
        return studentMapper.insertData(student);
    }

    @Override
    public int update(Student student) {
       return studentMapper.update(student);
    }

    @Override
    @Transactional
    public int transaction(Student student) {
        studentMapper.insertData(student);
        student.setSname("哼，我是事务");
        student.setSno(8);
        int i = 1/0;
        return studentMapper.update(student);
    }
}
