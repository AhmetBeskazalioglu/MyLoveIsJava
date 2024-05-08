package javamodules.xml;

import com.github.javafaker.Faker;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.List;

public class JAXB_List_Marshal {


    public static void main(String[] args) {

        Faker faker = new Faker();

        Customer customer = new Customer("Ahmet", "Beşkazalıoğlu", 37, new Job("Software Developer", 10000));
        Customer customer2 = new Customer(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1, 100), new Job(faker.company().profession(), faker.number().numberBetween(1, 10000)));
        Customer customer3 = new Customer(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1, 100), new Job(faker.company().profession(), faker.number().numberBetween(1, 10000)));
        Customer customer4 = new Customer(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1, 100), new Job(faker.company().profession(), faker.number().numberBetween(1, 10000)));
        Customer customer5 = new Customer(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1, 100), new Job(faker.company().profession(), faker.number().numberBetween(1, 10000)));
        Customer customer6 = new Customer(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1, 100), new Job(faker.company().profession(), faker.number().numberBetween(1, 10000)));
        Customer customer7 = new Customer(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1, 100), new Job(faker.company().profession(), faker.number().numberBetween(1, 10000)));
        Customer customer8 = new Customer(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1, 100), new Job(faker.company().profession(), faker.number().numberBetween(1, 10000)));
        Customer customer9 = new Customer(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1, 100), new Job(faker.company().profession(), faker.number().numberBetween(1, 10000)));
        Customer customer10 = new Customer(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1, 100), new Job(faker.company().profession(), faker.number().numberBetween(1, 10000)));

        List<Customer> customers = List.of(customer, customer2, customer3, customer4, customer5, customer6, customer7, customer8, customer9, customer10);
        CustomerListWrapper customerListWrapper = new CustomerListWrapper(customers);


        try {

            File file = new File("/Users/anke/Downloads/Kraft/CustomerList.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(CustomerListWrapper.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(customerListWrapper, file);
            marshaller.marshal(customerListWrapper, System.out);

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }

    }
}
