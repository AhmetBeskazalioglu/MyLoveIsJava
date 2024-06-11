package javamodules.jaxb_xml.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "employeesList")
public class PersonalListWrapper {

        private List<Personal> employees;

        public PersonalListWrapper() {
        }

        public PersonalListWrapper(List<Personal> employees) {
            this.employees = employees;
        }

        @XmlElement(name = "employee")
        public List<Personal> getEmployees() {
            return employees;
        }

        public void setEmployees(List<Personal> employees) {
            this.employees = employees;
        }
}
