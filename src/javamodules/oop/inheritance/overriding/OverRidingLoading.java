package javamodules.oop.inheritance.overriding;

public class OverRidingLoading {

        public static void main(String[] args){

        }
}

class A{
    void method(){
        System.out.println("class A");
    }

    String method(String str){
        return "class A "+str;
    }

    // Overloading'te metot ismi ve parametreler aynı olmalıdır.
    // Aşağıdaki metot "void method()" metodu ile aynı isme sahip olduğu için hata veriyor.
    // String method(){}

    // Aşağıdaki metot "String method(String str)" metodu ile aynı isme sahip olduğu için hata veriyor.
    // void method(String str){}
}

class B extends A{

    // 'method()' in 'B' clashes with 'method()' in 'A'; attempting to use incompatible return type
    // method() metodunu override etmek istersen return type'ı değiştiremezsin.

    /*String method(){
        return "class B";
    }*/

}

