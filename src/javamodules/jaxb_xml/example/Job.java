package javamodules.jaxb_xml.example;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Job {

    private String name;
    private int dept;
    private Company company;

    public Job() {
    }

    public Job(String name, int dept) {
        super();
        this.name = name;
        this.dept = dept;
    }

    public Job(String name, int dept, Company company) {
        super();
        this.name = name;
        this.dept = dept;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Job [name=" + name + ", dept=" + dept + ", company=" + company + "]";
    }

}
