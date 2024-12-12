package javamodules.oop.interfaces;

interface I
{
    class C
    {
        int i;

        public C(int i)
        {
            this.i = ++i;
        }

        int methodC()
        {
            return ++i;
        }
    }
}

public class InterfaceExample3
{
    public static void main(String[] args)
    {
        I.C c = new I.C(000);

        System.out.println(c.methodC());
    }
}
