package javamodules.oop.interfaces;

interface H
{
    class C implements H
    {
        public void methodH(int i)
        {
            System.out.println(i);
        }
    }

    void methodH(int i);
}

public class InterfaceExample4
{
    public static void main(String[] args)
    {
        H.C c = new H.C();
        c.methodH(10);
    }
}