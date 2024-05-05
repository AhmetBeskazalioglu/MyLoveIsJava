package javamodules.finalkeyword;

//04.05.24 Cumartesi

public class FinalKeyword {

    static {
        final int s = 30; // Static blok içinde tanımlandı
        System.out.println("s = " + s);
    }

    {
        final int i = 30; // Instance blok içinde tanımlandı
        System.out.println("i = " + i);
    }


    final int x; // Tanımlandığı yerde değer almak zorundadır

    public FinalKeyword() {
        x = 10; // Constructor içinde assign ediliyor
    }

    public void myMethod() {
        final int y; // Metot içinde tanımlandı
        y = 20; // Metot içinde assign ediliyor
        System.out.println("y = " + y);
    }
}

class Test {
    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();
        System.out.println(obj.x);
        obj.myMethod();

    }
}