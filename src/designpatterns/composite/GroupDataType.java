package designpatterns.composite;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GroupDataType implements DataType{
    private List<DataType> dataTypes;

    public GroupDataType() {
        dataTypes = new ArrayList<>();
    }

    public void add(DataType dataType) {
        dataTypes.add(dataType);
    }

    public void remove(DataType dataType) {
        dataTypes.remove(dataType);
    }

    public List<DataType> getDataTypes() {
        return dataTypes;
    }


    @Override
    public Object convert() throws JAXBException, IOException {
        List<Object> objects = new ArrayList<>();
        for (DataType dataType : dataTypes) {
            objects.add(dataType.convert());
        }
        return objects;
    }
}
