package javamodules.interfaces.diamondproblem;

interface A {
    default void showA() {
        System.out.println("Interface A");
    }
}

interface B {
    default void showB() {
        System.out.println("Interface B");
    }

    default void display(){
        System.out.println("B interface, Default display methodu. ");
    }

    void must();
}

class C implements A, B {

    @Override
    public void must() {

    }
}

public class DiamondProblem {
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
    }
}

