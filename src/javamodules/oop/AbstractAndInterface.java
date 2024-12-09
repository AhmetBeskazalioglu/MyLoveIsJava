package javamodules.oop;

public class AbstractAndInterface {
    interface A {
        default void method() {
            System.out.println("Interface A");
        }
    }

    abstract class B {
        public void method() {
            System.out.println("Abstract Class B");
        }
    }

    class C extends B implements A {
        // No method override
    }

    /*
    //    * Eğer A interface'inden gelen methodu çağırmak istersek, aşağıdaki gibi bir yöntem kullanılabilir.
    class C extends B implements A {
        @Override
        public void method() {
            A.super.method(); // Interface A'dan gelen metodu çağırır
        }
    }
    */

    public static void main(String[] args) {
        AbstractAndInterface.C obj = new AbstractAndInterface().new C();
        obj.method();
    }
}
