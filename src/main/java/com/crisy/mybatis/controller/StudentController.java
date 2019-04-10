package com.crisy.mybatis.controller;

import com.crisy.mybatis.dao.StudentMapper;
import com.crisy.mybatis.pojo.Student;
import com.crisy.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/getAll")
    public List getAll(){
        return studentService.findAll();
    }

    @RequestMapping("/getById")
    public Student getById(){
        return studentService.findByid(1);
    }

    @RequestMapping("/getByName")
    public Student getByName(){
        return studentService.findByName("刘丽");
    }

    @RequestMapping("/findPage")
    public List<Student> findPage(){
        Student student = new Student();
        student.setSex("男");
        return studentService.findPage(student,1,2);
    }
    @RequestMapping("/insert")
    public int insert(){
        Student student = new Student();
        student.setSex("男");
        student.setSname("耶耶耶~~");
        student.setAge(99);
        return studentService.insert(student);
    }

    @RequestMapping("/update")
    public int update(){
        Student student = new Student();
        student.setSno(5);
        student.setSex("男");
        student.setSname("噜啦啦~~~~");
        student.setAge(99);
        return studentService.update(student);
    }
    @RequestMapping("/transaction")
    public int transaction(){
        Student student = new Student();
        student.setSex("女");
        student.setSname("first");
        student.setAge(99);
        return studentService.transaction(student);
    }
}
