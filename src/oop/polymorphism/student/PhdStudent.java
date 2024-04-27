package oop.polymorphism.student;

public class PhdStudent extends GraduateStudent{

    boolean qualifyingExamTaken;

    public PhdStudent(int no, String name, int year, double date, String thesis, String advisor, boolean qualifyingExamTaken) {
        super(no, name, year, date, thesis, advisor);
        this.qualifyingExamTaken = qualifyingExamTaken;
    }

    @Override
public void study() {
        System.out.println("Phd student is studying.");
    }

    @Override
    public void register() {
        System.out.println("Phd student is registering.");
    }

    @Override
    public void writeThesis() {
        System.out.println("Phd student is writing thesis.");
    }

    @Override
    public void meetWithAdvisor() {
        System.out.println("Phd student is meeting with advisor.");
    }

    public void writePaper() {
        System.out.println("Phd student is writing paper.");
    }

    @Override
    public String toString() {
        return "PhdStudent{" +
                "no=" + getNo() +
                ", name='" + getName() + '\'' +
                ", year=" + getYear() +
                ", date=" + getDate() +
                ", major='" + getMajor() + '\'' +
                ", thesis='" + getThesis() + '\'' +
                ", advisor='" + getAdvisor() + '\'' +
                ", qualifyingExamTaken=" + qualifyingExamTaken +
                '}';
    }

}
