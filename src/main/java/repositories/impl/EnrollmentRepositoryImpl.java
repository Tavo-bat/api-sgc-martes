package repositories.impl;

import models.Enrollment;
import repositories.EnrollmentRepository;

import java.util.List;

public class EnrollmentRepositoryImpl implements EnrollmentRepository {

    private final List<Enrollment> enrollmentList;

    public EnrollmentRepositoryImpl(List<Enrollment> enrollment){
        this.enrollmentList = enrollment;
    }

    @Override
    public void save(Enrollment enrollment) {
        enrollmentList.add(enrollment);
    }

    @Override
    public Enrollment findById(Long id) {
        for (Enrollment enrollment : enrollmentList){
            if(enrollment.getId().equals(id)){
                return enrollment;
            }
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        Enrollment enrollment = findById(id);
            if (enrollment != null){
                enrollmentList.remove(enrollment);
            }
    }

    @Override
    public List<Enrollment> findAll() {
        return enrollmentList;
    }
}
