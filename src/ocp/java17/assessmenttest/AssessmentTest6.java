package ocp.java17.assessmenttest;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * AssessmentTest6
 *
 * Question 6:
 * Suppose that we have the following property files and code.
 * What values are printed on lines 8 and 9, respectively?
 *
 * Property Files:
 * Penguin.properties
 * name=Billy
 * age=1
 *
 * Penguin_de.properties
 * name=Chilly
 * age=4
 *
 * Penguin_en.properties
 * name=Willy
 *
 * Code:
 * 5: Locale fr = new Locale("fr");
 * 6: Locale.setDefault(new Locale("en", "US"));
 * 7: var b = ResourceBundle.getBundle("Penguin", fr);
 * 8: System.out.println(b.getString("name"));
 * 9: System.out.println(b.getString("age"));
 *
 * Options:
 * A. Billy and 1
 * B. Billy and null
 * C. Willy and 1
 * D. Willy and null
 * E. Chilly and null
 * F. The code does not compile.
 *
 * Soru 6:
 * Aşağıdaki gibi özellik dosyaları ve kod verilmiştir. 8. ve 9. satırlarda sırasıyla hangi değerler yazdırılır?
 *
 * Özellik Dosyaları:
 * Penguin.properties
 * name=Billy
 * age=1
 *
 * Penguin_de.properties
 * name=Chilly
 * age=4
 *
 * Penguin_en.properties
 * name=Willy
 *
 * Kod:
 * 5: Locale fr = new Locale("fr");
 * 6: Locale.setDefault(new Locale("en", "US"));
 * 7: var b = ResourceBundle.getBundle("Penguin", fr);
 * 8: System.out.println(b.getString("name"));
 * 9: System.out.println(b.getString("age"));
 *
 * Şıklar:
 * A. Billy ve 1
 * B. Billy ve null
 * C. Willy ve 1
 * D. Willy ve null
 * E. Chilly ve null
 * F. Kod derlenmez.
 *
 * Açıklama:
 * - `ResourceBundle.getBundle("Penguin", fr)` ifadesi, `"fr"` (Fransızca) yerelleştirmesi için uygun bir özellik dosyası arar.
 * - Ancak `"Penguin_fr.properties"` dosyası mevcut değildir, bu nedenle `ResourceBundle` varsayılan dosyayı kullanır: `Penguin.properties`.
 * - Varsayılan dosya `name=Billy` ve `age=1` değerlerini içerir. Bu nedenle çıktı `Billy` ve `1` olur.
 *
 * Şıkların değerlendirilmesi:
 * - **A:** Doğru, çünkü varsayılan dosya kullanılır ve `Billy` ile `1` değerleri yazdırılır.
 * - **B:** Yanlış, `age` özelliği `1` olarak bulunur.
 * - **C:** Yanlış, `"Penguin_en.properties"` dosyası kullanılmaz.
 * - **D:** Yanlış, `"Penguin_en.properties"` dosyası kullanılmaz.
 * - **E:** Yanlış, `"Penguin_de.properties"` dosyası kullanılmaz.
 * - **F:** Yanlış, kod derlenir ve çalışır.
 *
 * Çözüm:
 * Kod çalıştırıldığında ekrana sırasıyla `Billy` ve `1` yazdırılır.
 */
public class AssessmentTest6 {
    public static void main(String[] args) {
        // Yerel ayar ve özellik dosyasını seçme
        Locale fr = new Locale("fr"); // Fransızca yerel ayar
        Locale.setDefault(new Locale("en", "US")); // Varsayılan yerel ayar İngilizce (ABD)

        // ResourceBundle oluşturulması
        ResourceBundle b = ResourceBundle.getBundle("Penguin", fr);

        // Çıktı
        System.out.println(b.getString("name")); // Çıktı: Billy
        System.out.println(b.getString("age"));  // Çıktı: 1
    }
}