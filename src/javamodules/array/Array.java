package javamodules.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        String[] strArray={"a","b","c"};
        System.out.println(Arrays.toString(strArray));
        List list= Arrays.asList(strArray);
        System.out.println(list);
    }
}
