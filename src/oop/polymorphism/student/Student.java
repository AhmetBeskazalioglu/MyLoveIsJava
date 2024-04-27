package oop.polymorphism.student;

public class Student {
    private int no;
    private String name;
    private int year;
    private double date;
    private String major;

    public Student(int no, String name, int year, double date, String major) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.date = date;
        this.major = major;
    }

    public void study() {
        System.out.println("Student is studying.");
    }

    public void register() {
        System.out.println("Student is registering.");
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDate() {
        return date;
    }

    public void setDate(double date) {
        this.date = date;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", date=" + date +
                ", major='" + major + '\'' +
                '}';
    }
}
