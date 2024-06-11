package javamodules.string;

public class StringBuilder_Example {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb.toString()); // Hello World

        sb.insert(5, ",");
        System.out.println(sb.toString()); // Hello, World

        sb.replace(5, 6, "!");
        System.out.println(sb.toString()); // Hello! World

        sb.delete(5, 6);
        System.out.println(sb.toString()); // Hello World

        sb.reverse();
        System.out.println(sb.toString()); // dlroW olleH

        String str = sb.toString();
        StringBuilder sb1 = new StringBuilder(str);
        String strReverse = sb1.reverse().toString();
        System.out.println(strReverse); // Hello World

        System.out.println("*************************");

        sb1= new StringBuilder("Hello World");
        System.out.println(sb1.reverse()); // dlroW olleH

    }
}
