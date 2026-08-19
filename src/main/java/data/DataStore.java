package data;

import models.Course;
import models.Enrollment;
import models.Student;

import java.util.ArrayList;
import java.util.List;

public class DataStore {

        private final List<Student> studentsList;
        private final List<Course> courseList;
        private final List<Enrollment> enrollmentList;

        public DataStore(){
            studentsList = new ArrayList<>();
            courseList =  new ArrayList<>();
            enrollmentList = new ArrayList<>();
        }

        public List<Student> getAllStudents(){
            return studentsList;
        }

        public void addStudent(Student student){
            studentsList.add(student);
        }

        public Student getStudent(Long id){
            for (Student student : studentsList) {
                if (student.getId().equals(id)){
                    return student;
                }
            }
            return null;
        }

    public void removeStudent(Long id){
     Student student = getStudent(id);
     if (student != null) {
         studentsList.remove(student);
     }
    }

    // Métodos para Course
    public List<Course> getAllCourses() {
        return courseList;
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public Course getCourse(Long id) {
        for (Course course : courseList) {
            if (course.getId().equals(id)) {
                return course;
            }
        }
        return null;
    }

    public void removeCourse(Long id) {
        Course course = getCourse(id);
        if (course != null) {
            courseList.remove(course);
        }
    }

    // Métodos para Enrollment
    public List<Enrollment> getAllEnrollments() {
        return enrollmentList;
    }

    public void addEnrollment(Enrollment enrollment) {
        enrollmentList.add(enrollment);
    }

    public Enrollment getEnrollment(Long id) {
        for (Enrollment enrollment : enrollmentList) {
            if (enrollment.getId().equals(id)) {
                return enrollment;
            }
        }
        return null;
    }

    public void removeEnrollment(Long id) {
        Enrollment enrollment = getEnrollment(id);
        if (enrollment != null) {
            enrollmentList.remove(enrollment);
        }
    }
}
