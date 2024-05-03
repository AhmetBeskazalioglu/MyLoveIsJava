package javamodules.oop.polymorphism.student;

public class GraduateStudent extends Student{

    private String thesis;
    private String advisor;

    public GraduateStudent(int no, String name, int year, double date, String thesis,String advisor){
        super(no, name, year, date,"Graduate");
        this.thesis = thesis;
        this.advisor = advisor;
    }

    @Override
    public void study() {
        System.out.println("Graduate student is studying.");
    }

    @Override
    public void register() {
        System.out.println("Graduate student is registering.");
    }

    public void writeThesis() {
        System.out.println("Graduate student is writing thesis.");
    }

    public void meetWithAdvisor() {
        System.out.println("Graduate student is meeting with advisor.");
    }

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    @Override
    public String toString() {
        return "GraduateStudent{" +
                "no=" + getNo() +
                ", name='" + getName() + '\'' +
                ", year=" + getYear() +
                ", date=" + getDate() +
                ", major='" + getMajor() + '\'' +
                ", thesis='" + thesis + '\'' +
                ", advisor='" + advisor + '\'' +
                '}';
    }
}
