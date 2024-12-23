package ocp.java17.assessmenttest;

import java.util.*;

/**
 * AssessmentTest13
 *
 * Question 13:
 * Which of the following statements can fill in the blank to make the code compile successfully? (Choose all that apply.)
 *
 * Code:
 * Set<? extends RuntimeException> mySet = new __________ ();
 *
 * Options:
 * A. HashSet<? extends RuntimeException>
 * B. HashSet<Exception>
 * C. TreeSet<RuntimeException>
 * D. TreeSet<NullPointerException>
 * E. None of the above
 *
 * Soru 13:
 * Aşağıdaki kodun başarılı bir şekilde derlenebilmesi için boşluğu hangi ifadeler doldurabilir? (Birden fazla seçenek seçilebilir.)
 *
 * Kod:
 * Set<? extends RuntimeException> mySet = new __________ ();
 *
 * Şıklar:
 * A. HashSet<? extends RuntimeException>
 * B. HashSet<Exception>
 * C. TreeSet<RuntimeException>
 * D. TreeSet<NullPointerException>
 * E. Hiçbiri
 *
 * Açıklama:
 * - `Set<? extends RuntimeException>` ifadesi, `RuntimeException` ve onun alt sınıflarını tutan bir `Set` belirtir.
 * - Bu durumda, sadece `RuntimeException` veya onun alt sınıflarını içeren bir `Set` atanabilir.
 * - Şıklardan yalnızca **C ve D** doğru cevaplar olabilir, çünkü:
 *   - **A:** Yanlış, çünkü wildcard (`? extends`) doğrudan nesne oluşturulurken kullanılamaz.
 *   - **B:** Yanlış, çünkü `Exception` sınıfı `RuntimeException`'ın üst sınıfıdır.
 *   - **C:** Doğru, çünkü `TreeSet<RuntimeException>` `Set<? extends RuntimeException>`'e atanabilir.
 *   - **D:** Doğru, çünkü `TreeSet<NullPointerException>` (bir alt sınıf) `Set<? extends RuntimeException>`'e atanabilir.
 *   - **E:** Yanlış, çünkü doğru seçenekler vardır.
 *
 * Çözüm:
 * Doğru cevap: **C, D**
 */
public class AssessmentTest13 {
    public static void main(String[] args) {
        // Doğru Atamalar
        Set<? extends RuntimeException> mySet1 = new TreeSet<RuntimeException>(); // Doğru
        Set<? extends RuntimeException> mySet2 = new TreeSet<NullPointerException>(); // Doğru

        // Yanlış Atamalar (Derleme Hatası)
        // Set<? extends RuntimeException> mySet3 = new HashSet<? extends RuntimeException>(); // Yanlış
        // Set<? extends RuntimeException> mySet4 = new HashSet<Exception>(); // Yanlış

        // Doğru atamaların kontrolü
        System.out.println("TreeSet<RuntimeException> ve TreeSet<NullPointerException> doğru atanmıştır.");
    }
}