package javamodules.oop.interfaces.exampleshape;

public class ShapeTest {

    public static void main(String[] args) {

        Daire d= new Daire(5);
        Kare k= new Kare(5);
        Dikdortgen dikdortgen= new Dikdortgen(5, 10);
        Ucgen ucgen= new Ucgen(3, 4, 5, 6);

        System.out.println("Dairenin alanı: "+d.alan());
        System.out.println("Dairenin çevresi: "+d.cevre());

        System.out.println("Kare alanı: "+k.alan());
        System.out.println("Kare çevresi: "+k.cevre());

        System.out.println("Dikdörtgen alanı: "+dikdortgen.alan());
        System.out.println("Dikdörtgen çevresi: "+dikdortgen.cevre());

        System.out.println("Üçgen alanı: "+ucgen.alan());
        System.out.println("Üçgen çevresi: "+ucgen.cevre());
    }
}
