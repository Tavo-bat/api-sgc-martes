package app;

import app.console.StudentConsole;
import data.DataStore;
import repositories.StudentRepository;
import repositories.impl.StudentRepositoryImpl;
import service.StudentService;
import service.impl.StudentServiceImpl;

public class Main {
    public static void main(String[] args) {

        StudentRepository studentRepository = new StudentRepositoryImpl(DataStore.getAllStudents());
        StudentService studentService = new StudentServiceImpl(studentRepository);
        StudentConsole studentConsole = new StudentConsole(studentService);

        studentConsole.createStudent();
        studentConsole.studentList();

        /*

        dataStore.addStudent(new Student(1L, "Juan", "Sanchez", "ejemplo1@correo.com", "11122223333"));
        dataStore.addStudent(new Student(2L, "Maria", "Lopez", "ejemplo2@correo.com", "22233334444"));

        dataStore.getAllStudents().forEach(student -> {
            System.out.println("ID: " + student.getId() +
                    ", Nombre: " + student.getFirstName() +
                    " " + student.getLastName() +
                    ", Email: " + student.getEmail() +
                    ", Teléfono: " + student.getPhone());
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
        });*/
    }
}
