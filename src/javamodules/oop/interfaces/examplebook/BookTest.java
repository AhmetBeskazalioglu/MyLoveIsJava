package javamodules.oop.interfaces.examplebook;

public class BookTest {
    public static void main(String[] args) {
        BilimKurgu blm=new BilimKurgu("1","Bilim Kurgu","Ahmet",5);
        blm.yazdir();
        System.out.println();
        Macera macera=new Macera("2","Macera","Mehmet",10);
        macera.yazdir();
        System.out.println();
        Polisiye polisiye=new Polisiye("3","Polisiye","Ali",15);
        polisiye.yazdir();
    }
}
