package com.baizhi.controller;

import com.baizhi.entity.Student;
import com.baizhi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("selectAll")
    public String selectAll(Map map){
        Student student = studentService.selectAll();
        map.put("student",student);
        return "index";
    }
}
