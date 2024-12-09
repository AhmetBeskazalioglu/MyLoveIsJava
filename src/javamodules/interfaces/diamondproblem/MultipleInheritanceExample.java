package javamodules.interfaces.diamondproblem;

public class MultipleInheritanceExample {
    interface A {
        void display();
    }

    interface B {
        void display();
    }

    static class C implements A, B {
        @Override
        public void display() {
            //System.out.println("Class C'den display metodu.");
        }
    }

    public static void main(String[] args){
        MultipleInheritanceExample.C c= new MultipleInheritanceExample.C();
        c.display();
    }

}
