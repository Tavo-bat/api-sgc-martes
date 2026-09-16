package org.example.apisgcmartes.service;

import org.example.apisgcmartes.models.Course;

import java.util.List;

public interface CourseService{
    void save(Course course);
    Course findById(Long id);
    void deleteById(Long id);
    List<Course> findAll();
}