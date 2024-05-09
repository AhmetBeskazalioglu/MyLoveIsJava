package javamodules.jaxb_xml.example;

import designpatterns.singleton.enumsingleton.DatabaseSingletonEnum;

import javax.xml.bind.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public class Personal_Jaxb {
    private static DatabaseSingletonEnum db;
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;
    private static List<Personal> employees;
    private static PersonalListWrapper personalListWrapper;
    private static Personal personel;
    private static PersonalListWrapper unmarshalledPersonalListWrapper;

    /**
     * Databaseden gelen verileri listeye ekler.
     */
    public static void fromDatabaseToList(String query) {
        db = DatabaseSingletonEnum.INSTANCE;
        connection = db.getConnection();
        statement = db.getStatement();

        employees = new ArrayList<>();

        try {
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                personel = new Personal();
                personel.setId(resultSet.getInt("id"));
                personel.setName(resultSet.getString("ad"));
                personel.setSurname(resultSet.getString("soyad"));
                personel.setAge(resultSet.getInt("yas"));
                personel.setCinsiyet(resultSet.getBoolean("cinsiyet"));
                personel.setCity(resultSet.getString("sehir"));
                personel.setCountry(resultSet.getString("ulke"));
                personel.setSalary(resultSet.getString("maas"));
                personel.setJob(new Job(resultSet.getString("job"), resultSet.getInt("dept"),
                        new Company(resultSet.getString("company"),
                                resultSet.getString("address"),
                                resultSet.getString("phone_no"),
                                resultSet.getString("industry"))));
                personel.setEducation(new Education(resultSet.getString("school"),
                        resultSet.getString("course"),
                        resultSet.getString("campus"),
                        resultSet.getInt("year")));
                employees.add(personel);

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
        personalListWrapper = new PersonalListWrapper(employees);
        try {
            File file = new File("/Users/anke/Downloads/Kraft/PersonalListFromDatabase.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(PersonalListWrapper.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(personalListWrapper, file);
            marshaller.marshal(personalListWrapper, System.out);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Xml dosyasını okur ve listeye ekler.
     */
    public static void unmarshalOfList() {

        try {
            File file = new File("/Users/anke/Downloads/Kraft/PersonalListFromDatabase.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(PersonalListWrapper.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            unmarshalledPersonalListWrapper = (PersonalListWrapper) unmarshaller.unmarshal(file);

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }


    }


    public static void main(String[] args) {
        String query1 = "select * from personal as p join personal_job as pj on p.job_id=pj.id join personal_company as pc on pj.company_id=pc.id join personal_education as pe on pe.id=p.education_id order by p.id";

        fromDatabaseToList(query1);
        marshalOfList();
        unmarshalOfList();

        unmarshalledPersonalListWrapper.getEmployees().forEach(System.out::println);
        System.out.println("********************************");
        unmarshalledPersonalListWrapper.getEmployees().forEach(x -> System.out.println(x.getJob()));
        System.out.println("********************************");
        unmarshalledPersonalListWrapper.getEmployees().forEach(x -> System.out.println(x.getName()));
        System.out.println("********************************");
        unmarshalledPersonalListWrapper.getEmployees().forEach(x -> System.out.println(x.getName()+"'s school address: "+x.getJob().getCompany().getAddress()));





    }
}
