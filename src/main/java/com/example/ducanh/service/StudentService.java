package com.example.ducanh.service;



import com.example.ducanh.model.Student;
import com.example.ducanh.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
//
//    public Object addStudent(Student s){
//        return studentRepository.save(s);
//    }
//
//    public Object updateStudent(Student s){
//
//        Student student = studentRepository.findById(s.getMaKhachHang()).orElse(null);
//        if(student == null){
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Không tìm thấy sinh viên có ID: " + s.getMaKhachHang());
//        }
//
//        return studentRepository.save(student);
//    }
//
//    public Object deleteStudent(Integer id){
//        //hàm delete phải viết như vầy, không được viết: return studentRepository.deleteById(id);
//        Student s = studentRepository.findById(id).orElse(null);
//        if(s == null){
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Không tìm thấy sinh viên có ID: " + id);
//        }
//        studentRepository.deleteById(id);
//        return ResponseEntity.ok("Xóa thành công sinh viên có ID: "+id);
//    }

}
