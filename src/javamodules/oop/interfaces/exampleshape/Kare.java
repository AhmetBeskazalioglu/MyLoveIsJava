package javamodules.oop.interfaces.exampleshape;

public class Kare implements Shape{

    private int a;

    public Kare(int a){
        this.a=a;
    }

    @Override
    public int cevre(){
        return 4*a;
    }

    @Override
    public int alan(){
        return a*a;
    }
}
