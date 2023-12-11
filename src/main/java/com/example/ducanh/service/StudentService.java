package com.example.ducanh.service;



import com.example.ducanh.model.Student;
import com.example.ducanh.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    public Object addStudent(Student s) {
        return studentRepository.save(s);
    }

    public Object deleteStudent(Integer id) {
        Student s = studentRepository.findById(id).orElse(null);
        if(s == null){
            ResponseEntity.ok("Xóa không thành công");
        }
        studentRepository.deleteById(id);
        return ResponseEntity.ok("Xóa thành công");

    }
}
