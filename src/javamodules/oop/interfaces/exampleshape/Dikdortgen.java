package javamodules.oop.interfaces.exampleshape;

public class Dikdortgen implements Shape{

    private int a,b;

    public Dikdortgen(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int cevre() {
        return (2*a)+(2*b);
    }

    @Override
    public int alan() {
        return a*b;
    }
}
