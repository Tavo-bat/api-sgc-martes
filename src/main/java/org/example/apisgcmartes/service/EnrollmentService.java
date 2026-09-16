package org.example.apisgcmartes.service;

import org.example.apisgcmartes.models.Enrollment;

import java.util.List;

public interface EnrollmentService {

    void save(Enrollment enrollment);
    Enrollment findById(Long id);
    void deleteById(Long id);
    List<Enrollment> findAll();
}
