package javamodules.jaxb_xml.example;

public class Education {

    private String school;
    private String course;
    private String campus;
    private int year;

    public Education() {
    }

    public Education(String school, String course, String campus, int year) {
        super();
        this.school = school;
        this.course = course;
        this.campus = campus;
        this.year = year;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Education [school=" + school + ", course=" + course + ", campus=" + campus + ", year=" + year + "]";
    }
}
