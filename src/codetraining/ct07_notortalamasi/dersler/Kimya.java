package codetraining.ct07_notortalamasi.dersler;

import codetraining.ct07_notortalamasi.ogrenciler.IOgrenci;

public class Kimya implements IDersler {

    @Override
    public double dersNotuHesapla(IOgrenci ogrenci) {
        return ogrenci.getVize() * 0.3 + ogrenci.getFinalNot() * 0.7;
    }
}
