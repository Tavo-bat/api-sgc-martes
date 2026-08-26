package repositories;

import models.Course;

import java.util.List;

public interface CourseRepository {

    void save(Course course);
    Course findById(Long id);
    void deleteById(Long id);
    List<Course> findAll();
}
