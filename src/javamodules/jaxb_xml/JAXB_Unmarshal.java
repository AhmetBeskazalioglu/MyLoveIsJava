package javamodules.jaxb_xml;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXB_Unmarshal {
    public static void main(String[] args) {


        try {
            File file = new File("/Users/anke/Downloads/Kraft/customerAhmet.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Customer unmarshalledCustomer = (Customer) unmarshaller.unmarshal(file);
            System.out.println(unmarshalledCustomer);

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
