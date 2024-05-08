package javamodules.xml;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Job {
	
	private String name,dept;
	
	public Job() {

	}
	
	public Job(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Job [name=" + name + ", dept=" + dept + "]";
	}

}
