package codetraining.ct07_notortalamasi;

import codetraining.ct07_notortalamasi.dersler.*;
import codetraining.ct07_notortalamasi.ogrenciler.Ogrenci;
import codetraining.ct07_notortalamasi.ogrenciler.Ogrenci_2;
import codetraining.ct07_notortalamasi.ogrenciler.Ogrenci_3;

public class CT07_NotOrtalamasi {


    public static void main(String[] args) {

        Turkce turkceDersi = new Turkce();
        Matematik matematikDersi = new Matematik();
        Fizik fizikDersi = new Fizik();
        Kimya kimyaDersi = new Kimya();
        Cografya cografyaDersi = new Cografya();
        Tarih tarihDersi = new Tarih();
        Ingilizce ingilizceDersi = new Ingilizce();

        Ogrenci ogrenci = new Ogrenci("Ahmet", "Yılmaz", 123);
        Ogrenci_2 ogrenci_2 = new Ogrenci_2("Ali", "Çentik", 125);
        Ogrenci_3 ogrenci_3 = new Ogrenci_3("Veli", "Kara", 126);

        Dersler turkce =new Dersler(turkceDersi);
        turkce.durumHesapla(turkce.ilgiliDersNotu(ogrenci, ogrenci.vize(), ogrenci.finalNot()));
        System.out.println("************************************");

        Dersler matematik =new Dersler(matematikDersi);
        matematik.durumHesapla(matematik.ilgiliDersNotu(ogrenci_2, ogrenci_2.vize(), ogrenci_2.finalNot()));
        System.out.println("************************************");

        Dersler fizik =new Dersler(fizikDersi);
        fizik.durumHesapla(fizik.ilgiliDersNotu(ogrenci_3, ogrenci_3.vize(), ogrenci_3.finalNot()));
        System.out.println("************************************");

        turkce.durumHesapla(turkce.ilgiliDersNotu(ogrenci_3, ogrenci_3.vize(), ogrenci_3.finalNot()));
        System.out.println("************************************");








    }
}
