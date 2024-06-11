package javamodules.lambdaExpression;

//04.05.24 Cumartesi

import javamodules.oop.polymorphism.logger.DbLog;

public class LambdaInstance {

    public static void main(String[] args) {
        // Lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = (int x) -> System.out.println(2 * x);
        FuncInterface fobj2 = (int x) -> System.out.println(x);

        //Farkli dillerde selamlama
        Selamlama merhaba = (x) -> System.out.println("Merhaba " + x);
        Selamlama selam = (x) -> System.out.println("Selamun Aleyküm " + x);
        Selamlama hi = (x) -> System.out.println("Hello " + x);



        TemperatureConverter converterAll = (x, start, end) -> {
            if (start.toLowerCase().equals("celcius") && end.toLowerCase().equals("fahrenheit"))
                System.out.println(x + " " + start + "=" + (x * 9 / 5 + 32) + " " + end);
            else if (start.toLowerCase().equals("fahrenheit") && end.toLowerCase().equals("celcius"))
                System.out.println(x + " " + start + "=" + ((x - 32) * 5 / 9) + " " + end);
            else if (start.toLowerCase().equals("celcius") && end.toLowerCase().equals("kelvin"))
                System.out.println(x + " " + start + "=" + (x + 273.15) + " " + end);
            else if (start.toLowerCase().equals("kelvin") && end.toLowerCase().equals("celcius"))
                System.out.println(x + " " + start + "=" + (x - 273.15) + " " + end);
            else if (start.toLowerCase().equals("fahrenheit") && end.toLowerCase().equals("kelvin"))
                System.out.println(x + " " + start + "=" + ((x - 32) * 5 / 9 + 273.15) + " " + end);
            else if (start.toLowerCase().equals("kelvin") && end.toLowerCase().equals("fahrenheit"))
                System.out.println(x + " " + start + "=" + ((x - 273.15) * 9 / 5 + 32) + " " + end);
            else
                System.out.println("Invalid start or end temperature type");
        };




        // This calls above lambda expression and prints 10.
        fobj.abstractFun(5);
        fobj2.abstractFun(5);

        merhaba.hi("Ahmet");
        selam.hi("Mehmet");
        hi.hi("Elif");


        converterAll.convert(0, "Celcius", "Fahrenheit");
        converterAll.convert(32, "Fahrenheit", "Celcius");
        converterAll.convert(0, "Celcius", "Kelvin");
        converterAll.convert(273.15, "Kelvin", "Celcius");
        converterAll.convert(32, "Fahrenheit", "Kelvin");
        converterAll.convert(273.15, "Kelvin", "Fahrenheit");



        DbLog d=new DbLog();


    }
}

// A sample functional interface (An interface with single abstract method)
interface FuncInterface {
    // An abstract function
    void abstractFun(int x);
}

@FunctionalInterface
interface Selamlama {
    void hi(String kimi);
}

@FunctionalInterface
interface TemperatureConverter {
    void convert(double x, String start, String end);
}

// Interface tipindeki değişkeni metota parametre olarak göndermek
@FunctionalInterface
interface Printer {
    void print(double x, TemperatureConverter converter);
}