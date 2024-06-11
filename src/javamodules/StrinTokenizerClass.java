package javamodules;

public class StrinTokenizerClass {

    public static void main(String[] args) {
        String str = "Java StringTokenizer Class";
        java.util.StringTokenizer st = new java.util.StringTokenizer(str);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        System.out.println("*************************");

        String str1 = "Java StringTokenizer Class";
        java.util.StringTokenizer st1 = new java.util.StringTokenizer(str1, " ");
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }

        System.out.println("*************************");

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

    }
}
