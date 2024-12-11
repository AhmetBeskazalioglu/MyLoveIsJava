package javamodules.oop.interfaces.exampleshape;

public class Daire implements Shape{

    private int r;

    public Daire(int r) {
        this.r = r;
    }

    @Override
    public int cevre() {
        return (int) Math.PI*r*2;
    }

    @Override
    public int alan() {
        return (int) Math.PI*r*r;
    }
}
