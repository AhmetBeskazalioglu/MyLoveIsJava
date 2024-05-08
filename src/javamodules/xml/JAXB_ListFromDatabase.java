package javamodules.xml;

import designpatterns.singleton.enumsingleton.DatabaseSingletonEnum;

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

public class JAXB_ListFromDatabase {

    private static DatabaseSingletonEnum db;
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;
    private static List<Customer> customers= new ArrayList<>();
    private static CustomerListWrapper customerListWrapper;
    private static Customer customer;
    private static CustomerListWrapper unmarshalledCustomerListWrapper;

    public static void fromDatabaseToList(){
        db = DatabaseSingletonEnum.INSTANCE;
        connection = db.getConnection();
        statement = db.getStatement();

        try {
            resultSet = statement.executeQuery(
                    "select * from personel as p\n" +
                            "join personel_detay as pd\n" +
                            "on p.id=pd.id\n" +
                            "order by p.id");
            while (resultSet.next()) {
                customer = new Customer();
                customer.setName(resultSet.getString("ad"));
                customer.setSurname(resultSet.getString("soyad"));
                customer.setAge(resultSet.getInt("yas"));
                customer.setJob(new Job(resultSet.getString("job"), resultSet.getInt("maas")));
                customers.add(customer);
            }
            db.closeConnection();
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }

    public static void marshalOfList(){
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

    public static void unmarshalOfList(){

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

        fromDatabaseToList();
        marshalOfList();
        unmarshalOfList();

        unmarshalledCustomerListWrapper.getCustomers().forEach(System.out::println);
        System.out.println("********************************");
        unmarshalledCustomerListWrapper.getCustomers().forEach(x -> System.out.println(x.getJob()));
        System.out.println("********************************");
        unmarshalledCustomerListWrapper.getCustomers().forEach(x -> System.out.println(x.getName()));



    }




}
