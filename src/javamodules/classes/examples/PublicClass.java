package javamodules.classes.examples;

public class PublicClass{
    public static void main(String[] args){
        NonPublic1 n1 = new NonPublic1();
        NonPublic2 n2 = new NonPublic2();
        NonPublic3 n3 = new NonPublic3();
        n1.info();
        n2.info();
        n3.info();
    }
}
