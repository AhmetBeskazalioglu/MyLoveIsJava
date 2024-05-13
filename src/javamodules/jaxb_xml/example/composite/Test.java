package javamodules.jaxb_xml.example.composite;

import javamodules.jaxb_xml.example.PersonalListWrapper;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        GroupDataType groupDataType = new GroupDataType();
        Xml xml = new Xml();
        Json json = new Json();
        groupDataType.add(xml);
        groupDataType.add(json);

        try {
            List<DataType> dataTypes = groupDataType.getDataTypes();
            for (DataType dataType : dataTypes) {
                PersonalListWrapper personalListWrapper = (PersonalListWrapper) dataType.convert();
                System.out.println(personalListWrapper.getEmployees());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
