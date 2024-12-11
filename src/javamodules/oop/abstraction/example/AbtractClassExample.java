package javamodules.oop.abstraction.example;

public class AbtractClassExample {

    abstract class AbstractClass {

        public String instanceVariable = "Instance variable in abstract class";
        protected String protectedInstanceVariable = "Protected instance variable in abstract class";
        String defaultInstanceVariable = "Default instance variable in abstract class";
        private String privateInstanceVariable = "Private instance variable in abstract class";


        public abstract void method1();
        protected abstract void method2();
        abstract void method3();


        public void method4() {
            System.out.println("Public concrete method in abstract class");
        }

        protected void method5() {
            System.out.println("Protected concrete method in abstract class");
        }

        void method6() {
            System.out.println("Default concrete method in abstract class");
        }

        private void method7() {
            System.out.println("Private concrete method in abstract class");
        }

        static void method8() {
            System.out.println("Static method in abstract class");
        }

        final void method9() {
            System.out.println("Final method in abstract class");
        }

        synchronized void method10() {
            System.out.println("Synchorized method in abstract class");
        }
    }

    class ConcreteClass {

        public String instanceVariable = "Instance variable in concrete class";
        protected String protectedInstanceVariable = "Protected instance variable in concrete class";
        String defaultInstanceVariable = "Default instance variable in concrete class";
        private String privateInstance= "Private instance variable in concrete class";

        public void method1() {
            System.out.println("Public method in concrete class");
        }

        protected void method2() {
            System.out.println("Protected method in concrete class");
        }

        void method3() {
            System.out.println("Default method in concrete class");
        }

        private void method4() {
            System.out.println("Private method in concrete class");
        }

        static void method5() {
            System.out.println("Static method in concrete class");
        }

        final void method6() {
            System.out.println("Final method in concrete class");
        }

        synchronized void method7() {
            System.out.println("Synchronized method in concrete class");
        }
    }

    class AbstractExtended extends AbstractClass {
        @Override
        public void method1() {
            System.out.println("Method1 in AbstractExtended");
        }

        @Override
        protected void method2() {
            System.out.println("Method2 in AbstractExtended");
        }

        @Override
        void method3() {
            System.out.println("Method3 in AbstractExtended");
        }
    }

    class ConcreteExtended extends ConcreteClass {
        @Override
        public void method1() {
            System.out.println("Method1 in ConcreteExtended");
        }
    }
}
