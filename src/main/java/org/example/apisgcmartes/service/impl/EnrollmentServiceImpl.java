package org.example.apisgcmartes.service.impl;

import org.example.apisgcmartes.models.Enrollment;
import org.example.apisgcmartes.repositories.EnrollmentRepository;
import org.example.apisgcmartes.service.EnrollmentService;

import java.util.List;

public class EnrollmentServiceImpl implements EnrollmentService {

    private final EnrollmentRepository enrollmentRepository;

    public EnrollmentServiceImpl(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    @Override
    public void save(Enrollment enrollment) {
    enrollmentRepository.save(enrollment);
    }

    @Override
    public Enrollment findById(Long id) {
        return enrollmentRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
    enrollmentRepository.deleteById(id);
    }

    @Override
    public List<Enrollment> findAll() {
        return enrollmentRepository.findAll();
    }
}
