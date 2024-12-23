package codetraining.kt.ct07_notortalamasi;

import codetraining.kt.ct07_notortalamasi.dersler.*;
import codetraining.kt.ct07_notortalamasi.ogrenciler.IOgrenci;
import codetraining.kt.ct07_notortalamasi.ogrenciler.Ogrenci;
import codetraining.kt.ct07_notortalamasi.ogrenciler.Ogrenci_2;
import codetraining.kt.ct07_notortalamasi.ogrenciler.Ogrenci_3;

public class CT07_NotOrtalamasi {


    public static void main(String[] args) {

        Turkce turkceDersi = new Turkce();
        Matematik matematikDersi = new Matematik();
        Fizik fizikDersi = new Fizik();
        Kimya kimyaDersi = new Kimya();
        Cografya cografyaDersi = new Cografya();
        Tarih tarihDersi = new Tarih();
        Ingilizce ingilizceDersi = new Ingilizce();

        IOgrenci ogrenci = new Ogrenci("Ahmet", "Yılmaz", 123);
        IOgrenci ogrenci_2 = new Ogrenci_2("Ali", "Çentik", 125);
        IOgrenci ogrenci_3 = new Ogrenci_3("Veli", "Kara", 126);

        IDersler[] dersler = {turkceDersi, matematikDersi, fizikDersi, kimyaDersi, cografyaDersi, tarihDersi, ingilizceDersi};

        Okul_Idaresi okul_Idaresi = new Okul_Idaresi();

        okul_Idaresi.durumHesapla(okul_Idaresi.ilgiliDersNotu(ogrenci, turkceDersi));
        System.out.println("**********************************");
        okul_Idaresi.durumHesapla(okul_Idaresi.ilgiliDersNotu(ogrenci_2, matematikDersi));
        System.out.println("**********************************");
        okul_Idaresi.durumHesapla(okul_Idaresi.ilgiliDersNotu(ogrenci_3, fizikDersi));
        System.out.println("**********************************");
        okul_Idaresi.durumHesapla(okul_Idaresi.ilgiliDersNotu(ogrenci, kimyaDersi));
        System.out.println("**********************************");
        okul_Idaresi.durumHesapla(okul_Idaresi.ilgiliDersNotu(ogrenci_2, cografyaDersi));
        System.out.println("**********************************");
        okul_Idaresi.durumHesapla(okul_Idaresi.ilgiliDersNotu(ogrenci_3, tarihDersi));
        System.out.println("**********************************");
        okul_Idaresi.durumHesapla(okul_Idaresi.ilgiliDersNotu(ogrenci, ingilizceDersi));



    }
}
