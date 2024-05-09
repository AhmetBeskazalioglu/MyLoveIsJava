package javamodules.jaxb_xml;

import designpatterns.singleton.enumsingleton.DatabaseSingletonEnum;
import javamodules.jaxb_xml.example.Company;
import javamodules.jaxb_xml.example.Job;
import javamodules.jaxb_xml.example.Personal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JAXB_ListFromDatabase {

    private static DatabaseSingletonEnum db;
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;
    private static List<Customer> customers;
    private static CustomerListWrapper customerListWrapper;
    private static Customer customer;
    private static CustomerListWrapper unmarshalledCustomerListWrapper;

    /**
     * Databaseden gelen verileri listeye ekler.
     */
    public static void fromDatabaseToList(String query) {
        db = DatabaseSingletonEnum.INSTANCE;
        connection = db.getConnection();
        statement = db.getStatement();

        customers = new ArrayList<>();

        try {
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                customer = new Customer();
                customer.setName(resultSet.getString("ad"));
                customer.setSurname(resultSet.getString("soyad"));
                customer.setAge(resultSet.getInt("yas"));
                customer.setJob(new Job(resultSet.getString("job"), resultSet.getInt("dept"),
                new Company(resultSet.getString("company"), resultSet.getString("address"), resultSet.getString("phone_no"), resultSet.getString("industry"))));
                customers.add(customer);
            }
            db.closeConnection();
            System.out.println("Bağlantı kapatıldı.");
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }

    /**
     * Listeyi xml dosyasına yazar.
     */
    public static void marshalOfList() {
        customerListWrapper = new CustomerListWrapper(customers);
        try {
            File file = new File("/Users/anke/Downloads/Kraft/CustomerListFromDatabase.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(CustomerListWrapper.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(customerListWrapper, file);
            marshaller.marshal(customerListWrapper, System.out);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Xml dosyasını okur ve listeye ekler.
     */
    public static void unmarshalOfList() {

        try {
            File file = new File("/Users/anke/Downloads/Kraft/CustomerListFromDatabase.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(CustomerListWrapper.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            unmarshalledCustomerListWrapper = (CustomerListWrapper) unmarshaller.unmarshal(file);

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }


    }


    public static void main(String[] args) {
        String query1 = "select * from personal as p join personal_job as pj on p.id=pj.id join personal_company as pc on pj.company_id=pc.id order by p.id";

        fromDatabaseToList(query1);
        marshalOfList();
        unmarshalOfList();

        unmarshalledCustomerListWrapper.getCustomers().forEach(System.out::println);
        System.out.println("********************************");
        unmarshalledCustomerListWrapper.getCustomers().forEach(x -> System.out.println(x.getJob()));
        System.out.println("********************************");
        unmarshalledCustomerListWrapper.getCustomers().forEach(x -> System.out.println(x.getName()));
        System.out.println("********************************");
        //unmarshalledCustomerListWrapper.getCustomers().forEach(x -> System.out.println(x.getJob());

        unmarshalledCustomerListWrapper.getCustomers().stream().filter(x -> x.getJob().getDept()>20000).forEach(System.out::println);
        // departmana göre gruplama yap
        unmarshalledCustomerListWrapper.getCustomers().stream().collect(Collectors.groupingBy(x -> x.getJob().getDept()))
                .forEach((key, value) -> {
                    System.out.println(key);
                    value.forEach(System.out::println);
                });


    }


}
