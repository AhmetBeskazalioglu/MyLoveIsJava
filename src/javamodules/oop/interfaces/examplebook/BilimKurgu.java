package javamodules.oop.interfaces.examplebook;

public class BilimKurgu implements IBook{

    private String kitap, tur, yazar;
    private int fiyat;

    public BilimKurgu(String kitap, String tur, String yazar, int fiyat) {
        this.kitap=kitap;
        this.tur = tur;
        this.yazar = yazar;
        this.fiyat = fiyat;
    }

    @Override
    public String tur() {
        return tur;
    }

    @Override
    public String yazar() {
        return yazar;
    }

    @Override
    public int fiyat() {
        return fiyat;
    }

    public void yazdir(){
        System.out.println(
                "Kitap: " + kitap +
                "\nTürü: " + tur +
                "\nYazarı: " + yazar +
                "\nFiyatı: " + fiyat
                );
    }
}
