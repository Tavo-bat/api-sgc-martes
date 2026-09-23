package org.example.apisgcmartes.controllers;

import org.example.apisgcmartes.models.Student;
import org.example.apisgcmartes.repositories.StudentRepository;
import org.example.apisgcmartes.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @PostMapping
    public void save(Student student){
        studentService.save(student);
    }

    @GetMapping
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student findById(Long id){
        return studentService.findById(id);
    }

    @DeleteMapping ("/{id}")
    public void deleteById(Long id){
        studentService.deleteById(id);
    }
}