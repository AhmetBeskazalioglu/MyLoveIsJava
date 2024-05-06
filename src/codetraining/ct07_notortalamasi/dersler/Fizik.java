package codetraining.ct07_notortalamasi.dersler;

import codetraining.ct07_notortalamasi.ogrenciler.IOgrenci;

public class Fizik implements IDersler {


    @Override
    public double dersNotuHesapla(IOgrenci ogrenci, int vize, int finalNot) {
        System.out.print(
                ogrenci.getNo()+" nolu "+ogrenci.getAd()+" "+ogrenci.getSoyad()+
                        " adlı öğrencinin Fizik ders notu hesaplandı: ");
        return (vize * 0.3) + (finalNot * 0.7);
    }
}
