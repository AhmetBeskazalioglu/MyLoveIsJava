package javamodules.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class StringTokenizerClass {

    public static void main(String[] args) {
        String str = "Java StringTokenizer Class";
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        System.out.println("*************************");

        String str1 = "Java StringTokenizer Class";
        StringTokenizer st1 = new StringTokenizer(str1, " ");
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }

        System.out.println("*************************");

        // delim is part of the tokens
        String str2 = "Java StringTokenizer Class";
        java.util.StringTokenizer st2 = new java.util.StringTokenizer(str2, " ", true);
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }

        System.out.println("*************************");

        String str3 = "Java,is,my,favourite,programming,language";
        java.util.StringTokenizer st3 = new java.util.StringTokenizer(str3, ",");
        while (st3.hasMoreTokens()) {
            System.out.println(st3.nextToken());
        }

        System.out.println("*************************");

        String str4 = "Java,is*,my,favourite*,programming,language*";
        java.util.StringTokenizer st4 = new java.util.StringTokenizer(str4, ",*");
        while (st4.hasMoreTokens()) {
            System.out.println(st4.nextToken());
        }

        System.out.println("*************************");

        java.util.StringTokenizer st5 = new java.util.StringTokenizer(str4, "*");
        while (st5.hasMoreTokens()) {
            System.out.println(st5.nextToken());
        }

        System.out.println("*************************");

        StringTokenizer st6 = new StringTokenizer(str4, "*");
        System.out.println(st6.countTokens());
        List<String> list=new ArrayList<>();
        while (st6.hasMoreTokens()) {
            list.add(st6.nextToken());
        }
        System.out.println(list);
        System.out.println(list.size());

        //split
        // String[] arr=str4.split("*"); //java.util.regex.PatternSyntaxException: Dangling meta character '*' near index 0
        String[] arr=str4.split("\\*");
        list= Arrays.asList(arr);
        System.out.println(list);


    }
}
