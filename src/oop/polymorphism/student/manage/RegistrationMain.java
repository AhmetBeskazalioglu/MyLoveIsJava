package oop.polymorphism.student.manage;

import oop.polymorphism.student.*;

public class RegistrationMain {

    public static void main(String[] args) {
        StudentFactory studentFactory = new StudentFactory();
        Student student = studentFactory.studentFactory();

        RegistrationOffice registrationOffice = new RegistrationOffice();
        registrationOffice.registerStudent(student);



    }
}
