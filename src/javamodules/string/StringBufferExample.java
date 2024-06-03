package javamodules.string;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
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
    }
}

