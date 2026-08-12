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
}
