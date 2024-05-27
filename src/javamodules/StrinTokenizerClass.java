package javamodules;

public class StrinTokenizerClass {

    public static void main(String[] args) {
        String str = "Java StringTokenizer Class";
        java.util.StringTokenizer st = new java.util.StringTokenizer(str);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
