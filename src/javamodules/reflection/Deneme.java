package javamodules.reflection;

public class Deneme {

    private String ad;
    private String soyad;

    public void goster() {
        System.out.println("Ad: " + ad + " Soyad: " + soyad);
    }

    public String goster(String temp){
        System.out.println("Ad: " + ad + " Soyad: " + soyad + " Temp: " + temp);
        return temp;
    }

    public int goster(int temp){
        System.out.println("Ad: " + ad + " Soyad: " + soyad + " Temp: " + temp);
        return temp;
    }

    public void setAd(String ad) {
        this.ad = ad;
        System.out.println("Ad: " + ad);
    }
}
