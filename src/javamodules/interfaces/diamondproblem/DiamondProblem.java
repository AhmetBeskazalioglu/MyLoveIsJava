package javamodules.interfaces.diamondproblem;

interface A {
    default void show() {
        System.out.println("Interface A");
    }
}

interface B {
    default void show() {
        System.out.println("Interface B");
    }
}

class C implements A, B {
    @Override
    public void show() {
        A.super.show(); // Explicit olarak A'nın metodu çağrılıyor
        //B.super.show(); // Explicit olarak B'nin metodu çağrılıyor
    }
}

public class DiamondProblem {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}

