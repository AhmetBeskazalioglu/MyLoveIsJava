package designpatterns.composite;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public interface DataType<T> {
    T convert() throws JAXBException, IOException;
}
