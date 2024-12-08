package javamodules.oop.abstraction;

import javamodules.interfaces.diamondproblem.DiamondProblem;

public abstract class CanNotBeAbstract {

    // Abstract Methodlar
    abstract void method1();
    public abstract void method2();
    protected abstract void method3();
    //private abstract void method4(); // Private olamazlar; çünkü alt sınıfların erişimine kapalı olur.
    //static abstract void method5(); // Static olamazlar; çünkü static metotlar override edilemezler.
    //synchronized abstract void method6(); // Synchronized olamazlar; çünkü synchronized metotlar override edilemezler.

    // Concrete Methodlar
    void method7(){};
    public void method8(){};
    protected void method9(){};
    private void method10(){};
    static void method11(){};




    public static void main(String[] args) {
        System.out.println("Can there be a main method in abstract class? \nYes, there can be.");

    }


}
