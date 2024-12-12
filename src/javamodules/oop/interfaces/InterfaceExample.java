package javamodules.oop.interfaces;

interface ABC
{
     void methodOne();

     void methodTwo();
}

interface PQR extends ABC
{
     void methodOne();

     void methodTwo();
}

class XYZ implements PQR, ABC
{
     public void methodOne()
     {
          System.out.println("methodOne() in XYZ class");
     }

     public void methodTwo()
     {
          System.out.println("methodTwo() in XYZ class");
     }
}

public class InterfaceExample
{
     public static void main(String[] args)
     {
          XYZ obj = new XYZ();
          obj.methodOne();
          obj.methodTwo();
     }
}

