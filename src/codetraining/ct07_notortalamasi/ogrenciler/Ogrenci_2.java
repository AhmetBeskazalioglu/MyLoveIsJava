package codetraining.ct07_notortalamasi.ogrenciler;

public class Ogrenci_2 implements IOgrenci{
    private String ad;
    private String soyad;
    private int no;

    public Ogrenci_2() {

    }

    public Ogrenci_2(String ad, String soyad, int no) {
        this.ad = ad;
        this.soyad = soyad;
        this.no = no;
    }

    @Override
    public int vize() {
        return (int) (Math.random() * 60) + 50;
    }

    @Override
    public int finalNot() {
        return (int) (Math.random() * 100);
    }

    @Override
    public String getAd() {
        return ad;
    }

    @Override
    public String getSoyad() {
        return soyad;
    }

    @Override
    public String getNo() {
        return String.valueOf(no);
    }
}
