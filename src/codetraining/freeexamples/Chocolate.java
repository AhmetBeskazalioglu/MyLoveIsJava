package codetraining.freeexamples;

import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int weight = scanner.nextInt();
        int height = scanner.nextInt();
        int k = scanner.nextInt();

        if(k%weight==0||k%height==0)System.out.println("YES");
        else System.out.println("NO");

    }
}

/* Soruyu Açıklama:
	1.	Verilen Çikolata:
	•	N (genişlik) × M (yükseklik) boyutunda bir dikdörtgen şeklinde, 1x1 karelere bölünmüş bir çikolata var.
	2.	Hedef:
	•	Bir düz çizgi (dikey veya yatay) kullanarak tam olarak K adet kare koparıp ayırmak mümkün mü?
	3.	Kurallar:
	•	Kesme işlemi sadece tek bir çizgi ile yapılabilir. Yani diyagonal veya çoklu çizgi kesimi yapılamaz.
	•	Karelerin sayısı tam olarak K olmalıdır.
	4.	Girdi:
	•	Üç sayı verilir:
	•	N: Çikolatanın genişliği (satırdaki kare sayısı)
	•	M: Çikolatanın yüksekliği (sütundaki kare sayısı)
	•	K: Koparılmak istenen kare sayısı.
	5.	Çıktı:
	•	Eğer K adet kareyi tek bir yatay ya da dikey kesimle ayırmak mümkünse “YES” yazdır.
	•	Aksi halde “NO” yazdır.

Anlama Örneği:
	•	Örnek 1: N = 4, M = 2, K = 6
	•	Burada yatay kesimle 6 kare koparmak mümkün. Cevap: YES
	•	Örnek 2: N = 5, M = 4, K = 5
	•	Dikey bir kesimle 5 kare ayırmak mümkün. Cevap: YES
	•	Örnek 3: N = 2, M = 4, K = 3
	•	Tek bir düz çizgiyle 3 kareyi koparmak mümkün değil. Cevap: NO
	*/
