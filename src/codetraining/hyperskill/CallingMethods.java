package codetraining.hyperskill;

import codetraining.BestOne;

@BestOne
public class CallingMethods {
    public static void printSum(long val1, int val2) {
        System.out.println(val1 + val2);
    }

    public static void main(String[] args) {

        // Doğru çağrımlar
        printSum(123L, 13); // long ve int uygun
        printSum(123, 13); // Yanlış: 123 bir int, long'a otomatik dönüşür.

        // Yanlış çağrımlar
        // printSum(123L, 88L); // Yanlış: İkinci parametre int olmalı, ama burada long verilmiş.
        // printSum(123, 88L); // Yanlış: İlk parametre long olmalı, burada int verilmiş.
    }
}

/*
* Soru: Metot Çağrımı

Aşağıdaki metot tanımına sahipsiniz:

public static void printSum(long val1, int val2) {
    System.out.println(val1 + val2);
}

Bu metodu doğru bir şekilde çağırmak için aşağıdaki seçeneklerden hangilerini kullanabilirsiniz? Tüm doğru seçenekleri işaretleyiniz.

Seçenekler:
	1.	printSum(123L, 13);
	2.	printSum(123, 13);
	3.	printSum(123L, 88L);
	4.	printSum(123, 88L);

Doğru olanları seçiniz.
*
*

*/