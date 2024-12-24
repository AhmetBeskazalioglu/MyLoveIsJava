package codetraining.freeexamples;

public class LocalVariables {
    int instanceVariable; // Varsayılan olarak 0
    static double classVariable; // Varsayılan olarak 0.0

    public void method() {
        boolean localVariable; // Varsayılan değer yok
        System.out.println(instanceVariable); // Çıktı: 0
        System.out.println(classVariable);   // Çıktı: 0.0
        // System.out.println(localVariable); // Derleme Hatası: localVariable başlatılmadı
    }
}
