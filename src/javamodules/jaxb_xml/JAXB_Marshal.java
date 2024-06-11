package javamodules.jaxb_xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JAXB_Marshal {

    public static void main(String[] args) {

        Customer customer = new Customer("Ahmet", "Beşkazalıoğlu", 37);

        try {

            File file = new File("/Users/anke/Downloads/Kraft/customerAhmet.xml");// xml dosyasının oluşturulacağı dosya yolu
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(customer, file);
            marshaller.marshal(customer, System.out);


        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }


    }
}
