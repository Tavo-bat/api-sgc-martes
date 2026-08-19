package app;

import data.DataStore;
import models.Course;
import models.Enrollment;
import models.Student;

public class Main {
    public static void main(String[] args) {

        DataStore dataStore = new DataStore();

        dataStore.addStudent(new Student(1L, "Juan", "Sanchez", "ejemplo1@correo.com", "11122223333"));
        dataStore.addStudent(new Student(2L, "Maria", "Lopez", "ejemplo2@correo.com", "22233334444"));

        dataStore.getAllStudents().forEach(s -> {
            System.out.println("ID: " + s.getId() +
                    ", Nombre: " + s.getFirstName() +
                    " " + s.getLastName() +
                    ", Email: " + s.getEmail() +
                    ", Teléfono: " + s.getPhone());
        });

        dataStore.addCourse(new Course(101L, "Matemáticas I", "Curso de álgebra y cálculo básico."));
        dataStore.addCourse(new Course(102L, "Lógica", "Curso de lógica de programación"));

        dataStore.getAllCourses().forEach(course -> {
            System.out.println("ID: " + course.getId() + ", Nombre: " + course.getName() + ", Descripción: "
                    + course.getDescription());
        });

        dataStore.addEnrollment(new Enrollment(1L, 1L, 102L));
        dataStore.addEnrollment(new Enrollment(2L, 2L, 101L));

        dataStore.getAllEnrollments().forEach(enrollment -> {
            System.out.println("ID Matrícula: " + enrollment.getId() + ", ID Estudiante: " + enrollment.getStudentId()
                    + ", ID Curso: " + enrollment.getCourseId());
        });
    }
}
