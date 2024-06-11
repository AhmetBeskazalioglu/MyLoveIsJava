package javamodules.jaxb_xml.example;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "personal")
public class Personal {
    private int id;
    private String name;
    private String surname;
    private int age;
    private boolean cinsiyet;
    private String city;
    private String country;
    private String salary;
    private Job job;
    private Education education;

    public Personal() {
    }

    public Personal(int id, String name, String surname, int age, boolean cinsiyet, String city, String country, String salary, Job job, Education education) {
        super();
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.cinsiyet = cinsiyet;
        this.city = city;
        this.country = country;
        this.salary = salary;
        this.job = job;
        this.education = education;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(boolean cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Personel [id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age + ", cinsiyet=" + cinsiyet + ", city=" + city + ", country=" + country + ", salary=" + salary + ", job=" + job + ", education=" + education + "]";
    }
}
