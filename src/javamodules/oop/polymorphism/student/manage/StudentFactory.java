package javamodules.oop.polymorphism.student.manage;

import javamodules.oop.polymorphism.student.*;
import javamodules.oop.polymorphism.student.*;


public class StudentFactory {

    public Student studentFactory(){
        Student student = null;

        int i = (int) (6 * Math.random());

        switch (i) {
            case 0:
                student = new Student(1, "John", 1, 2000, "Computer Science");
                break;
            case 1:
                student = new VocationalStudent(2, "Jane", 2, 2001, "Electrical Engineering");
                break;
            case 2:
                student = new GraduateStudent(3, "Tom", 3, 2002, "Mechanical Engineering", "Thesis");
                break;
            case 3:
                student = new UndergraduateStudent(4, "Mary", 4, 2003, "Civil Engineering", "Junior");
                break;
            case 4:
                student = new MasterStudent(5, "Peter", 5, 2004, "Chemical Engineering", "Thesis");
                break;
            case 5:
                student = new PhdStudent(6, "Alice", 6, 2005, "Biomedical Engineering", "Dissertation", true);
                break;
        }
        return student;
    }
}
