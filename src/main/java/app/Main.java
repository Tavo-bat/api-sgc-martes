package app;

import models.Students;

public class Main {
    public static void main(String[] args) {

        Students student1 = new Students();
        Students student2 = new Students();
        Students student3 = new Students();
        Students student4 = new Students();
        Students student5 = new Students();

        student1.setId(1L);
        student1.setFirstName("Juan");
        student1.setLastName("Sanchez");
        student1.setEmail("ejemplo1@correo.com");
        student1.setPhone("11122223333");

        student2.setId(2L);
        student2.setFirstName("Maria");
        student2.setLastName("Lopez");
        student2.setEmail("ejemplo2@correo.com");
        student2.setPhone("22233334444");

        student3.setId(3L);
        student3.setFirstName("Carlos");
        student3.setLastName("Ramirez");
        student3.setEmail("ejemplo3@correo.com");
        student3.setPhone("33344445555");

        student4.setId(4L);
        student4.setFirstName("Ana");
        student4.setLastName("Martinez");
        student4.setEmail("ejemplo4@correo.com");
        student4.setPhone("44455556666");

        student5.setId(5L);
        student5.setFirstName("Luis");
        student5.setLastName("Gomez");
        student5.setEmail("ejemplo5@correo.com");
        student5.setPhone("55566667777");

        System.out.println(student1.getFirstName());
        System.out.println(student2.getFirstName());
        System.out.println(student3.getFirstName());
        System.out.println(student4.getFirstName());
        System.out.println(student5.getFirstName());

    }
}
