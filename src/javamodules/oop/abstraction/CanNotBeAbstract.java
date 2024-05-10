package javamodules.oop.abstraction;

public abstract class CanNotBeAbstract {

    //  Private olamazlar; çünkü alt sınıfların erişimine kapalı olur.
    //	private abstract void method1();

    //  Static olamazlar; çünkü static metotlar override edilemezler.
    //	public static abstract void method2();

    //  Synchronized olamazlar; çünkü synchronized metotlar override edilemezler.
    //	public synchronized abstract void method3();

    // Bu kullanımlar doğrudur

    // Access modifier olmadan da olur.
    abstract void method4();

    public abstract void method5();
    protected abstract void method6();

    public static void main(String[] args) {
        System.out.println("Can there be a main method in abstract class? \nYes, there can be.");
    }


}
