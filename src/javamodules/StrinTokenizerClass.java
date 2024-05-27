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

    }
}
