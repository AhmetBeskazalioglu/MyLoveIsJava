package javamodules.oop.interfaces.exampleshape;

public class Ucgen implements Shape{

    private int a, b, c;
    private int yukseklik;

    public Ucgen(int a, int b, int c,int yukseklik) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.yukseklik=yukseklik;
    }

    @Override
    public int cevre() {
        return a+b+c;
    }

    @Override
    public int alan() {
        return (yukseklik*a)/2;
    }
}
