package javamodules.jaxb_xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;


public class JAXB {


    public static void main(String[] args) {
        Customer customer = new Customer("Ahmet", "Beşkazalıoğlu", 37);
        Customer customer2= new Customer("Ali Rıza","Baba", 45);

        try{

            // Marshal işlemi
            File file = new File("customer.xml");// xml dosyasının oluşturulacağı dosya yolu
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);// 1. adım: JAXBContext sınıfı oluşturulur, parametre olarak Customer.class verilir

            Marshaller marshaller = jaxbContext.createMarshaller(); //// 2. adım: createMarshaller metodu ile marshaller nesnesi oluşturulur
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);// 3. adım: marshaller nesnesinin marshal metodu ile xml'e çevirme işlemi yapılır. xml'i düzenli hale getirir
            marshaller.marshal(customer, file);// 4. adım: marshal metodu ile xml'e çevirme işlemi yapılır
            marshaller.marshal(customer, System.out);// 5. adım: ekrana yazdırma işlemi yapılır


            // Unmarshal işlemi
            // 1. adım: JAXBContext sınıfı oluşturulur, parametre olarak Customer.class verilir
            // Zaten yukarıda oluşturulduğu için tekrar oluşturmaya gerek yok
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();// 2. adım: createUnmarshaller metodu ile unmarshaller nesnesi oluşturulur
            Customer unmarshalledCustomer = (Customer) unmarshaller.unmarshal(file);// 3. adım: unmarshal metodu ile xml'i Customer sınıfına çevirme işlemi yapılır
            System.out.println(unmarshalledCustomer);// 4. adım: ekrana yazdırma işlemi yapılır


        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }

    }


}
