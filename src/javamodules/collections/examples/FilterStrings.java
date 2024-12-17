package javamodules.collections.examples;

import java.util.LinkedList;
import java.util.List;

public class FilterStrings {

    public static List<Object> filterList(final List<Object> list) {
        List<Object> newList = new LinkedList<Object>();
        for(Object object:list){
            if(!(object instanceof String))newList.add(object);
        }
        return newList;
    }

}
