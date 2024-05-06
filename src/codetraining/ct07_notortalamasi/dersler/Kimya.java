package codetraining.ct07_notortalamasi.dersler;

import codetraining.ct07_notortalamasi.ogrenciler.IOgrenci;

public class Kimya implements IDersler {


    @Override
    public double dersNotuHesapla(IOgrenci ogrenci, int vize, int finalNot) {
        System.out.print(
                ogrenci.getNo()+" nolu "+ogrenci.getAd()+" "+ogrenci.getSoyad()+
                        " adlı öğrencinin Kimya ders notu hesaplandı: ");
        return (vize * 0.2) + (finalNot * 0.8);
    }
}
