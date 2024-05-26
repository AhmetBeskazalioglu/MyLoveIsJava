package javamodules.finalkeyword;

/**
 * @author Ahmet Beşkazalıoğlu
 * 04.05.24 Cumartesi
 */
public class FinalKeyword {
}

class FinalKeyword_InMethod {

    public void myMethod() {
        final int m; // Metot içinde tanımlandı
        m = 20; // Metot içinde assign ediliyor
        System.out.println("m = " + m);
    }
}

class FinalKeyword_InBlocks {

    static {
        final int s; // Static blok içinde tanımlandı
        s = 50; // Static blok içinde assign ediliyor
        System.out.println("s = " + s);
    }

    {
        final int i; // Instance blok içinde tanımlandı
        i = 30; // Instance blok içinde assign ediliyor
        System.out.println("i = " + i);
    }
}

class FinalKeyword_InConstructor {

    final int c; // Tanımlandığı yerde değer almak zorunda değildir.

    public FinalKeyword_InConstructor() {
        c = 40; // Constructor içinde assign ediliyor
        System.out.println("c = " + c);
    }
}

class FinalKeyword_InClass {
    final int clss = 5; // Tanımlandığı yerde değer almak zorundadır.
}

class Test {
    public static void main(String[] args) {
        FinalKeyword_InMethod obj1 = new FinalKeyword_InMethod();
        obj1.myMethod();

        FinalKeyword_InBlocks obj2 = new FinalKeyword_InBlocks();

        FinalKeyword_InConstructor obj3 = new FinalKeyword_InConstructor();

        FinalKeyword_InClass obj4 = new FinalKeyword_InClass();
        System.out.println("clss = " + obj4.clss);
    }
}