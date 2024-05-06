package codetraining.ct07_notortalamasi.dersler;

import codetraining.ct07_notortalamasi.ogrenciler.IOgrenci;

public class Turkce implements IDersler {


    @Override
    public double dersNotuHesapla(IOgrenci ogrenci, int vize, int finalNot) {
        System.out.print(
                ogrenci.getNo()+" nolu "+ogrenci.getAd()+" "+ogrenci.getSoyad()+
                        " adlı öğrencinin Türkçe ders notu hesaplandı: ");
        return (vize * 0.4) + (finalNot * 0.6);
    }
}
