package javamodules.xml;

import com.github.javafaker.Faker;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JAXB_List {


    public static void main(String[] args) {
        Faker faker = new Faker();

        Customer customer = new Customer("Ahmet", "Beşkazalıoğlu", 37);
        Customer customer2 = new Customer(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1, 100));
        Customer customer3 = new Customer(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1, 100));
        Customer customer4 = new Customer(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1, 100));
        Customer customer5 = new Customer(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1, 100));
        Customer customer6 = new Customer(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1, 100));
        Customer customer7 = new Customer(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1, 100));
        Customer customer8 = new Customer(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1, 100));
        Customer customer9 = new Customer(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1, 100));
        Customer customer10 = new Customer(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1, 100));

        try {

            File file = new File("/Users/anke/Downloads/Kraft/customerAhmet.xml");// xml dosyasının oluşturulacağı dosya yolu
            File file2 = new File("/Users/anke/Downloads/Kraft/customer2.xml");
            File file3 = new File("/Users/anke/Downloads/Kraft/customer3.xml");
            File file4 = new File("/Users/anke/Downloads/Kraft/customer4.xml");
            File file5 = new File("/Users/anke/Downloads/Kraft/customer5.xml");
            File file6 = new File("/Users/anke/Downloads/Kraft/customer6.xml");
            File file7 = new File("/Users/anke/Downloads/Kraft/customer7.xml");
            File file8 = new File("/Users/anke/Downloads/Kraft/customer8.xml");
            File file9 = new File("/Users/anke/Downloads/Kraft/customer9.xml");
            File file10 = new File("/Users/anke/Downloads/Kraft/customer10.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(customer, file);
            marshaller.marshal(customer2, file2);
            marshaller.marshal(customer3, file3);
            marshaller.marshal(customer4, file4);
            marshaller.marshal(customer5, file5);
            marshaller.marshal(customer6, file6);
            marshaller.marshal(customer7, file7);
            marshaller.marshal(customer8, file8);
            marshaller.marshal(customer9, file9);
            marshaller.marshal(customer10, file10);
            marshaller.marshal(customer, System.out);
            marshaller.marshal(customer2, System.out);
            marshaller.marshal(customer3, System.out);
            marshaller.marshal(customer4, System.out);
            marshaller.marshal(customer5, System.out);
            marshaller.marshal(customer6, System.out);
            marshaller.marshal(customer7, System.out);
            marshaller.marshal(customer8, System.out);
            marshaller.marshal(customer9, System.out);
            marshaller.marshal(customer10, System.out);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }

    }
}
