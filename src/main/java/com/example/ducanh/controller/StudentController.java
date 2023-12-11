package com.example.ducanh.controller;

import com.example.ducanh.model.Student;
import com.example.ducanh.service.StudentService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


///url: localhost:8080/student
@RestController
@RequestMapping(path = "/student")
public class StudentController {
    @Autowired
    private StudentService service;


    //Lấy tất cả sinh viên
    @GetMapping("")
    public List<Student> getAllStudent() {
        return service.getAll();
    }
    //Thêm mới sinh viên
    @PostMapping("")
    public Object addStudent(@RequestBody Student s) {
        return service.addStudent(s);
    }

    @DeleteMapping("/{id}")
    public Object addStudent(@PathVariable Integer id) {
        return service.deleteStudent(id);
    }


}
