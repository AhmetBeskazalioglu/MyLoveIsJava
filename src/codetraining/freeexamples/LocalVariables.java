package codetraining.freeexamples;

import codetraining.Details;

@Details
public class LocalVariables {
    int instanceVariable; // Varsayılan olarak 0
    static double classVariable; // Varsayılan olarak 0.0
    Math math; // Varsayılan olarak null

    public void method() {
        boolean localVariable; // Varsayılan değer yok
        System.out.println(instanceVariable); // Çıktı: 0
        System.out.println(classVariable);   // Çıktı: 0.0
        System.out.println(math);            // Çıktı: null
        // System.out.println(localVariable); // Derleme Hatası: localVariable başlatılmadı
    }

    public static void main(String[] args) {
        LocalVariables localVariables = new LocalVariables();
        localVariables.method();
    }
}
