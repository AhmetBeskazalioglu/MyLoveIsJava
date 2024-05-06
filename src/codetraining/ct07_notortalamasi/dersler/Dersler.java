package codetraining.ct07_notortalamasi.dersler;

import codetraining.ct07_notortalamasi.ogrenciler.IOgrenci;
import codetraining.ct07_notortalamasi.Okul_Idaresi;

public class Dersler extends Okul_Idaresi {
    private IDersler dersler;

    public Dersler(IDersler dersler) {
        this.dersler = dersler;
    }

    public int ilgiliDersNotu(IOgrenci ogrenci, int vize, int finalNot) {
        int not = (int) ((vize * 0.4) + (finalNot * 0.6));
        System.out.println((int) dersler.dersNotuHesapla(ogrenci, vize, finalNot) + " puan");
        return not;
    }


}
