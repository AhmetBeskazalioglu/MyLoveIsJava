package codetraining.ct07_notortalamasi;

public abstract class Notlar {

    //Not Ortalaması Hesaplayan Programı yazalım.
    //
    //Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin
    // vize ve final sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
    //
    //NOT ORTLAMALARINI AŞAĞIDAKİ GİBİ BELİRTELİM AYRI BELİRTELİM
    //NOT HARF ARALIĞI NOTU
    //90-100 / AA / 4,00
    //85-89 / BA / 3,50
    //80-84 / BB / 3,00
    //75-79 / CB / 2,50
    //70-74 / CC / 2,00
    //65-69 / DC / 1,50
    //60-64 / DD / 1,00
    //50-59 / FD / 0,50
    //49 VE ALTI / FF / 0,00
    //
    //Her ders için vize (%40), final (%60) alınarak not ortalaması hesaplanıp ekrana yazdırılır.
    //Aynı program içerisinde koşullu ifadeler kullanılarak, Tüm derslerin not ortalaması hesaplanarak
    // 70 cc 2,00 üzeri ise sınıfı geçti, altındaysa sınıfta kaldı şeklinde yazalım.
    //3 farklı öğrenci için bunu yapalım. Okul-sınıf-öğrenci yapısı kullanalım.
    //
    //Not1:   interface, abstract class kullanmak artı puandır.
    //Not2: Ternary Operator ya da Switch Case kullanmak artı puandır.


    public int vize;
    public int finalNot;

    public int notHesapla(int vize, int finalNot) {
        return (vize * 40 / 100) + (finalNot * 60 / 100);
    }

    public String harfNotuHesapla(int not) {
        if (not >= 90) {
            return "AA 4,00";
        } else if (not >= 85) {
            return "BA 3,50";
        } else if (not >= 80) {
            return "BB 3,00";
        } else if (not >= 75) {
            return "CB 2,50";
        } else if (not >= 70) {
            return "CC 2,00";
        } else if (not >= 65) {
            return "DC 1,50";
        } else if (not >= 60) {
            return "DD 1,00";
        } else if (not >= 50) {
            return "FD 0,50";
        } else {
            return "FF 0,00";
        }
    }

    public String durumHesapla(int not) {
        if (not >= 70) {
            return "Sınıfı Geçti";
        } else {
            return "Sınıfta Kaldı";
        }
    }



    public abstract String toString();
}
