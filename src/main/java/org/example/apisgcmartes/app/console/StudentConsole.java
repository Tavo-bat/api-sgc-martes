package org.example.apisgcmartes.app.console;

import org.example.apisgcmartes.models.Student;
import org.example.apisgcmartes.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentConsole {

    private final StudentService studentService;
    private final java.util.Scanner scanner;

    public StudentConsole(StudentService studentService) {
        this.studentService = studentService;
        this.scanner = new Scanner(System.in);
    }

    public void createStudent(){

        System.out.println("\n--- Crear Estudiante ---");
        System.out.println("Ingrese ID: ");
        Long id = Long.parseLong(scanner.nextLine());
        System.out.println("Ingrese el nombre");
        String firstName = scanner.nextLine();
        System.out.println("Ingrese apellido: ");
        String lastName = scanner.nextLine();
        System.out.println("Ingrese correo: ");
        String email = scanner.nextLine();
        System.out.println("Ingrese teléfono: ");
        String phone = scanner.nextLine();

        Student student = new Student(id, firstName, lastName, email, phone);
        studentService.save(student);

        studentService.save(new Student(1L, "juan", "perez", "juan@cesde.net", "3135464"));

        System.out.println("Estudiantes creados con éxito.");
    }

    public void studentList(){
        List<Student> students = studentService.findAll();
        students.forEach(System.out::println);
    }
}
