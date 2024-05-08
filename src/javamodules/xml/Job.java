package javamodules.xml;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Job {

    private String name;
    private int dept;

    public Job() {
    }

    public Job(String name, int dept) {
        super();
        this.name = name;
        this.dept = dept;
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

    @Override
    public String toString() {
        return "Job [name=" + name + ", dept=" + dept + "]";
    }

}
