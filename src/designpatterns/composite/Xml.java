package designpatterns.composite;

import javamodules.jaxb_xml.example.PersonalListWrapper;

import javax.xml.bind.*;
import java.io.File;
import java.io.IOException;

public class Xml implements DataType {


    @Override
    public Object convert() throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(PersonalListWrapper.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        PersonalListWrapper personalListWrapper = (PersonalListWrapper) unmarshaller.unmarshal(
                new File("/Users/anke/Downloads/Kraft/PersonalListFromDatabase.xml"));
        return personalListWrapper;

    }
}
