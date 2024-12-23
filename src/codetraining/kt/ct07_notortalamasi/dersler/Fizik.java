package codetraining.kt.ct07_notortalamasi.dersler;

import codetraining.kt.ct07_notortalamasi.ogrenciler.IOgrenci;

public class Fizik implements IDersler {

    @Override
    public double dersNotuHesapla(IOgrenci ogrenci) {
        return ogrenci.getVize() * 0.4 + ogrenci.getFinalNot() * 0.6;
    }
}
