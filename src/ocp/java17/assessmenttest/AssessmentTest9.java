package ocp.java17.assessmenttest;

/**
 * AssessmentTest9
 *
 * Question 9:
 * Suppose you have a module named `com.vet`. Where could you place the following `module-info.java` file to create a valid module?
 *
 * `module-info.java`:
 * public module com.vet {
 *     exports com.vet;
 * }
 *
 * Options:
 * A. At the same level as the `com` folder
 * B. At the same level as the `vet` folder
 * C. Inside the `vet` folder
 * D. None of the above
 *
 * Soru 9:
 * `com.vet` adında bir modülünüz olduğunu varsayın. Aşağıdaki `module-info.java` dosyasını geçerli bir modül oluşturmak için nereye yerleştirebilirsiniz?
 *
 * `module-info.java`:
 * public module com.vet {
 *     exports com.vet;
 * }
 *
 * Şıklar:
 * A. `com` klasörüyle aynı seviyede
 * B. `vet` klasörüyle aynı seviyede
 * C. `vet` klasörünün içinde
 * D. Hiçbiri
 *
 * Açıklama:
 * - `module-info.java` dosyası, bir Java modülü için **kaynak klasörünün kök dizininde** bulunmalıdır.
 * - `com.vet` modülünde `com` ve `vet` paketleri olabilir, ancak bu paketler `module-info.java` ile aynı seviyede olmamalıdır.
 * - Eğer `module-info.java` dosyası yanlış bir seviyeye yerleştirilirse, derleme başarısız olur ve geçerli bir modül oluşturulamaz.
 *
 * Şıkların değerlendirilmesi:
 * - **A:** Yanlış, `module-info.java` dosyası `com` klasörünün içinde değil, aynı seviyede olmalıdır.
 * - **B:** Doğru, `module-info.java` dosyası `vet` klasörüyle aynı seviyede olmalıdır.
 * - **C:** Yanlış, `module-info.java` dosyası `vet` klasörünün içinde olmamalıdır.
 * - **D:** Yanlış, doğru bir seçenek mevcuttur (B).
 *
 * Çözüm:
 * Doğru cevap: **B**
 */
public class AssessmentTest9 {
    public static void main(String[] args) {
        System.out.println("This question is about module placement.");
        // This file is only explanatory. There is no executable code needed for this assessment.
    }
}