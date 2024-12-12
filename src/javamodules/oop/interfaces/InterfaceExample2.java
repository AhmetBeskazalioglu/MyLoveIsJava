package javamodules.oop.interfaces;

interface X
{
    void methodOne();
}

interface Y extends X
{
    void methodTwo();
}

abstract class Z implements Y
{

}

// bu örnekte verilen abstract class (Z) abstract bir sınıf olduğu için, interface’deki metotları override etmek zorunda değildir.
// Ancak, eğer bu sınıf concrete bir sınıf (somut sınıf) olsaydı,
// Y interface’inden ve dolayısıyla X interface’inden gelen tüm abstract metotları override etmek zorunda olurdu.











public class InterfaceExample2
{
    public static void main(String[] args)
    {
        //XYZ obj = new XYZ();
        //obj.methodOne();
        //obj.methodTwo();
    }
}