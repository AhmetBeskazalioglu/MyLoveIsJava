package codetraining.ct07_notortalamasi;

import codetraining.ct07_notortalamasi.dersler.IDersler;
import codetraining.ct07_notortalamasi.ogrenciler.IOgrenci;

public class Okul_Idaresi {

    public int ilgiliDersNotu(IOgrenci ogrenci, IDersler ders) {
        int vizeNot= (int) (Math.random() * 100);
        int finalNot = (int) (Math.random() * 100);
        ogrenci.setVize(vizeNot);
        ogrenci.setFinalNot(finalNot);
        System.out.println(ogrenci.getNo() + " nolu " + ogrenci.getAd() +" "+ogrenci.getSoyad()+ " isimli öğrencinin " + ders.getClass().getSimpleName()
                + " dersinden aldığı not hesaplandı: " + ders.dersNotuHesapla(ogrenci));
        return (int) ders.dersNotuHesapla(ogrenci);
    }

    public void durumHesapla(int not) {

        String durum = "";
        if (not >= 90) {
            durum = "AA / 4,00";
        } else if (not >= 85) {
            durum = "BA / 3,50";
        } else if (not >= 80) {
            durum = "BB / 3,00";
        } else if (not >= 75) {
            durum = "CB / 2,50";
        } else if (not >= 70) {
            durum = "CC / 2,00";
        } else if (not >= 65) {
            durum = "DC / 1,50";
        } else if (not >= 60) {
            durum = "DD / 1,00";
        } else if (not >= 50) {
            durum = "FD / 0,50";
        } else {
            durum = "FF / 0,00";
        }

        String result = not + "/ " + durum;
        result += (not >= 70) ? " ile Dersi Geçti" : " ile ders tekrarı yapılacak.";
        System.out.println(result);
    }


}
