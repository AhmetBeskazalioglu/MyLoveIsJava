package javamodules.jaxb_xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "customerList")
public class CustomerListWrapper {

    private List<Customer> customers;

    public CustomerListWrapper() {
    }

    public CustomerListWrapper(List<Customer> customers) {
        this.customers = customers;
    }

    @XmlElement(name = "customer")
    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

}
