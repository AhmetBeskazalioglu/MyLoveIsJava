package javamodules.oop.polymorphism.student;

public class VocationalStudent extends Student{

    public VocationalStudent(int no, String name, int year, double date, String major) {
        super(no, name, year, date, major);
    }

    @Override
    public void study() {
        System.out.println("Vocational student is studying.");
    }

    @Override
    public void register() {
        System.out.println("Vocational student is registering.");
    }

    @Override
    public String toString() {
        return "VocationalStudent{" +
                "no=" + getNo() +
                ", name='" + getName() + '\'' +
                ", year=" + getYear() +
                ", date=" + getDate() +
                ", major='" + getMajor() + '\'' +
                '}';
    }
}
