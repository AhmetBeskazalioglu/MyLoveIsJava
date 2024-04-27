package oop.polymorphism.student;

public class MasterStudent extends GraduateStudent{

    public MasterStudent(int no, String name, int year, double date, String thesis, String advisor) {
        super(no, name, year, date, thesis, advisor);
    }

    @Override
    public void study() {
        System.out.println("Master student is studying.");
    }

    @Override
    public void register() {
        System.out.println("Master student is registering.");
    }

    @Override
    public void writeThesis() {
        System.out.println("Master student is writing thesis.");
    }

    @Override
    public void meetWithAdvisor() {
        System.out.println("Master student is meeting with advisor.");
    }

    @Override
    public String toString() {
        return "MasterStudent{" +
                "no=" + getNo() +
                ", name='" + getName() + '\'' +
                ", year=" + getYear() +
                ", date=" + getDate() +
                ", major='" + getMajor() + '\'' +
                ", thesis='" + getThesis() + '\'' +
                ", advisor='" + getAdvisor() + '\'' +
                '}';
    }
}
