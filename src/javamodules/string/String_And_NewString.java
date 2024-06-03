package javamodules.string;

public class String_And_NewString {
    public static void main(String[] args) {

        String str1= new String("Java");
        String str2= new String("Java");

        System.out.println(str1==str2); // false // because they are different objects
        System.out.println(str1.equals(str2)); // true // because they have the same value

        System.out.println("*************************");

        String str3= "Java";
        String str4= "Java";

        System.out.println(str3==str4); // true // because they are the same object
        System.out.println(str3.equals(str4)); // true // because they have the same value
    }
}
