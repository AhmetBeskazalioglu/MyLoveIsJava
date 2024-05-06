package codetraining.ct07_notortalamasi.ogrenciler;


public class Ogrenci implements IOgrenci {

    private String ad;
    private String soyad;
    private int no;

    public Ogrenci() {

    }

    public Ogrenci(String ad, String soyad, int no) {
        this.ad = ad;
        this.soyad = soyad;
        this.no = no;
    }


    @Override
    public int vize() {
        return (int) (Math.random() * 50) + 50;
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
