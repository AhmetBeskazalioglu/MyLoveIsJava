package javamodules.oop.interfaces;

public interface PrivateMethods {

    public int a = 0;
    final int b = 0;
    static int c = 0;
    public static final int d = 0;

        /*
        Interface cannot have initializer block
        {
                a=0;
        }
        */

    private void methodA() {
        System.out.println("Private method in interface");
    }
}
