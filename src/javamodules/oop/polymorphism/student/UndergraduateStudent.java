package javamodules.oop.polymorphism.student;

public class UndergraduateStudent extends Student{

    private String minor;

    public UndergraduateStudent(int no, String name, int year, double date, String major, String minor) {
        super(no, name, year, date, major);
        this.minor = minor;
    }

    @Override
    public void study() {
        System.out.println("Undergraduate student is studying.");
    }

    @Override
    public void register() {
        System.out.println("Undergraduate student is registering.");
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    @Override
    public String toString() {
        return "UndergraduateStudent{" +
                "no=" + getNo() +
                ", name='" + getName() + '\'' +
                ", year=" + getYear() +
                ", date=" + getDate() +
                ", major='" + getMajor() + '\'' +
                ", minor='" + minor + '\'' +
                '}';
    }
}
