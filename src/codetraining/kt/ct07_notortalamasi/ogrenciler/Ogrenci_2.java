package codetraining.kt.ct07_notortalamasi.ogrenciler;

public class Ogrenci_2 implements IOgrenci{
    private String ad;
    private String soyad;
    private int no;
    private int vize;
    private int finalNot;

    public Ogrenci_2() {

    }

    public Ogrenci_2(String ad, String soyad, int no) {
        this.ad = ad;
        this.soyad = soyad;
        this.no = no;
    }

    @Override
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Override
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getVize() {
        return vize;
    }

    @Override
    public void setVize(int vize) {
        this.vize = vize;
    }

    public int getFinalNot() {
        return finalNot;
    }

    @Override
    public void setFinalNot(int finalNot) {
        this.finalNot = finalNot;
    }
}
