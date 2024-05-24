package javamodules.generics;

public class Generics_Methods {

    // Generic method
    public static <E> void yaz(E e){
        System.out.println(e);
    }

    // Generic method with return type
    public static <E> E yazdir(E e){
        System.out.println(e);
        return e;
    }

    // Generic method with kısıtlama
    public static <E extends Number> void yazdir1(E e){
        System.out.println(e.intValue());
        System.out.println(e.doubleValue());
    }

    // Generic method with kısıtlama
    public static <E extends CharSequence> void yazdir2(E e){
        System.out.println(e.length());
    }

    public static void main(String[] args) {
        yaz(10);
        yaz("Java");
        yaz(10.5);
        yaz('A');
        yaz(10.5f);
        yaz(10L);
        System.out.println("*************************");
        yazdir1(10);
        yazdir2("Java");
        yazdir1(10.5);
        yazdir2("Python");
        yazdir1(10.5f);
        yazdir1(10L);
    }


}
