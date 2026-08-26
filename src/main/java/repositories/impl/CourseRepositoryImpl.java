package repositories.impl;

import models.Course;
import repositories.CourseRepository;

import java.util.List;

public class CourseRepositoryImpl implements CourseRepository {

    private final List <Course> courseList;

    public CourseRepositoryImpl(List<Course> courses){
        this.courseList = courses;
    }

    @Override
    public void save(Course course) {
        courseList.add(course);
    }

    @Override
    public Course findById(Long id) {
        for (Course course : courseList){
            if (course.getId().equals(id)){
                return course;
            }
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        Course course = findById(id);
        if (course != null){
            courseList.remove(course);
        }

    }

    @Override
    public List<Course> findAll() {
        return courseList;
    }
}
