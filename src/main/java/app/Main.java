package app;

import models.Courses;
import models.Enrollments;
import models.Students;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Students> studentsList = new ArrayList<>();

        studentsList.add(new Students(1L, "Juan", "Sanchez", "ejemplo1@correo.com", "11122223333"));
        studentsList.add(new Students(2L, "Maria", "Lopez", "ejemplo2@correo.com", "22233334444"));
        studentsList.add(new Students(3L, "Carlos", "Ramirez", "ejemplo3@correo.com", "33344445555"));
        studentsList.add(new Students(4L, "Ana", "Martinez", "ejemplo4@correo.com", "44455556666"));
        studentsList.add(new Students(5L, "Luis", "Gomez", "ejemplo5@correo.com", "55566667777"));

        System.out.println("--- Lista Completa de Estudiantes ---");
        for (Students s : studentsList) {
            System.out.println("ID: " + s.getId() +
                    ", Nombre: " + s.getFirstName() +
                    " " + s.getLastName() +
                    ", Email: " + s.getEmail() +
                    ", Teléfono: " + s.getPhone());
        }

        System.out.println("\n--- Lista de Cursos Disponibles ---");

        List<Courses> coursesList = new ArrayList<>();

        coursesList.add(new Courses(101L, "Matemáticas I", "Curso de álgebra y cálculo básico."));
        coursesList.add(new Courses(102L, "Programación en Java",
                "Introducción a la programación orientada a objetos con Java."));
        coursesList.add(new Courses(103L, "Bases de Datos", "Conceptos de bases de datos relacionales y SQL."));

        for (Courses course : coursesList) {
            System.out.println("ID: " + course.getId() + ", Nombre: " + course.getName() + ", Descripción: "
                    + course.getDescription());
        }

        List<Enrollments> enrollmentsList = new ArrayList<>();

        enrollmentsList.add(new Enrollments(1L, 1L, 102L));
        enrollmentsList.add(new Enrollments(2L, 2L, 101L));
        enrollmentsList.add(new Enrollments(3L, 3L, 103L));
        enrollmentsList.add(new Enrollments(4L, 1L, 103L));
        enrollmentsList.add(new Enrollments(5L, 4L, 102L));

        System.out.println("\n--- Lista de Matrículas ---");
        for (Enrollments enrollment : enrollmentsList) {
            System.out.println("ID Matrícula: " + enrollment.getId() + ", ID Estudiante: " + enrollment.getStudentId()
                    + ", ID Curso: " + enrollment.getCourseId());
        }
    }
}
