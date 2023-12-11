package com.example.ducanh.controller;

import com.example.ducanh.model.Student;
import com.example.ducanh.service.StudentService;
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
//
////    //Chi tiết sinh viên
////    @GetMapping("")
////    public List<Student> getAllStudent() {
////        return service.getAll();
////    }
//
    //Thêm mới sinh viên
    @PostMapping("")
    public Object addStudent(@RequestBody Student s) {
        return service.addStudent(s);
    }

//
//    //Sửa sinh viên
//    @PutMapping("")
//    public Object updateStudent(@RequestBody Student s) {
//        return service.updateStudent(s);
//    }
//
//
//    //Xóa sinh viên
//    @DeleteMapping("/{id}")
//    public Object deleteById(@PathVariable Integer id) {
//        return service.deleteStudent(id);
//    }

}
