package org.example.apisgcmartes.repositories.impl;

import org.example.apisgcmartes.models.Student;
import org.example.apisgcmartes.repositories.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private final List<Student> studentsList;

    public StudentRepositoryImpl(List<Student> students){
        this.studentsList = students;
    }

    @Override
    public void save(Student student) {
        studentsList.add(student);
    }

    @Override
    public Student findById(Long id) {
        for (Student student : studentsList) {
            if (student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        Student student = findById(id);
        if (student != null) {
            studentsList.remove(student);
        }
    }

    @Override
    public List<Student> findAll() {
        return studentsList;
    }
}
