package designpatterns.composite;

import com.fasterxml.jackson.databind.ObjectMapper;
import javamodules.jaxb_xml.example.PersonalListWrapper;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;

public class Json implements DataType{

    @Override
    public Object convert() throws JAXBException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        PersonalListWrapper personalListWrapper = objectMapper.readValue(
                new File("/Users/anke/Downloads/Kraft/PersonalListFromDatabase.json"), PersonalListWrapper.class);
        return personalListWrapper;
    }
}

