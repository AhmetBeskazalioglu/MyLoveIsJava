package javamodules.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXB_List_Unmarshal {

    public static void main(String[] args) {

        try {

            File file = new File("/Users/anke/Downloads/Kraft/CustomerList.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(CustomerListWrapper.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            CustomerListWrapper unmarshalledCustomerListWrapper = (CustomerListWrapper) unmarshaller.unmarshal(file);

            unmarshalledCustomerListWrapper.getCustomers().forEach(System.out::println);
            //unmarshalledCustomerListWrapper.getCustomers().forEach(x-> System.out.println(x));

            System.out.println("********************************");

            unmarshalledCustomerListWrapper.getCustomers().forEach(x -> System.out.println(x.getJob()));



        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
