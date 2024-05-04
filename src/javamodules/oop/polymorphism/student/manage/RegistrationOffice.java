package javamodules.oop.polymorphism.student.manage;

import javamodules.oop.polymorphism.student.*;
import javamodules.oop.polymorphism.student.*;



public class RegistrationOffice {

    public Student getAStudent(Student aStudent){
        if (aStudent instanceof PhdStudent p){
            p.study();
            p.register();
            p.writePaper();
            p.writeThesis();
            p.meetWithAdvisor();
            System.out.println(p);
        } else if (aStudent instanceof MasterStudent m){
            m.study();
            m.register();
            m.writeThesis();
            m.meetWithAdvisor();
            System.out.println(m);
        } else if (aStudent instanceof GraduateStudent g){
            g.study();
            g.register();
            g.writeThesis();
            g.meetWithAdvisor();
            System.out.println(g);
        } else if (aStudent instanceof VocationalStudent v){
            v.study();
            v.register();
            System.out.println(v);
        } else if (aStudent instanceof UndergraduateStudent u){
            u.study();
            u.register();
            System.out.println(u);
        } else {
            aStudent.study();
            aStudent.register();
            System.out.println(aStudent);
        }
        return aStudent;
    }

    public void registerStudent(Student student){
        student.register();
    }
}
