package javamodules.oop.abstraction;

abstract class A {
    abstract void display();
    static void print() {
        System.out.println("Static method in abstract class");
    }
}

class B extends A {
    @Override
    void display() {
        System.out.println("Display method in class B");
    }

}