package ocp.java17.assessmenttest;

import java.util.Comparator;
import java.util.function.*;

/**
 * AssessmentTest8
 *
 * Question 8:
 * Which functional interfaces complete the following code, presuming variable r exists? (Choose all that apply.)
 *
 * 6: ______ x = r.negate();
 * 7: ______ y = () -> System.out.println();
 * 8: ______ z = (a, b) -> a - b;
 *
 * Options:
 * A. BinaryPredicate<Integer, Integer>
 * B. Comparable<Integer>
 * C. Comparator<Integer>
 * D. Consumer<Integer>
 * E. Predicate<Integer>
 * F. Runnable
 * G. Runnable<Integer>
 *
 * Soru 8:
 * Aşağıdaki kodu tamamlayan işlevsel arayüzler nelerdir? (r değişkeninin var olduğunu varsayalım.) (Birden fazla şık seçilebilir.)
 *
 * 6: ______ x = r.negate();
 * 7: ______ y = () -> System.out.println();
 * 8: ______ z = (a, b) -> a - b;
 *
 * Şıklar:
 * A. BinaryPredicate<Integer, Integer>
 * B. Comparable<Integer>
 * C. Comparator<Integer>
 * D. Consumer<Integer>
 * E. Predicate<Integer>
 * F. Runnable
 * G. Runnable<Integer>
 *
 * Açıklama:
 * - Java'da işlevsel arayüzler (functional interfaces), tek bir soyut metodu olan arayüzlerdir. Lambda ifadeleri ve method referanslarıyla kullanılırlar.
 *
 * **Satır Satır İnceleme:**
 * 1. `r.negate()`:
 *    - `Predicate<Integer>` arayüzünde `negate()` metodu bulunur. Bu nedenle doğru cevap **E**.
 * 2. `() -> System.out.println();`:
 *    - Bu ifade herhangi bir parametre almayan ve bir şey döndürmeyen bir işlemi temsil eder. Bu, **Runnable** arayüzüne uyar. Doğru cevap **F**.
 * 3. `(a, b) -> a - b;`:
 *    - İki parametre alır ve bir değer döndürür. Bu, **Comparator<Integer>** arayüzüne uyar. Doğru cevap **C**.
 *
 * Şıkların değerlendirilmesi:
 * - **A:** Yanlış, çünkü `BinaryPredicate` diye bir arayüz Java'nın standart kütüphanesinde bulunmamaktadır.
 * - **B:** Yanlış, `Comparable` arayüzü tek bir `compareTo` metodu içerir ancak bu kodda kullanılmaz.
 * - **C:** Doğru, `(a, b) -> a - b` ifadesi `Comparator` arayüzüne uygundur.
 * - **D:** Yanlış, çünkü `Consumer` bir değer alır ancak bir şey döndürmez.
 * - **E:** Doğru, `r.negate()` bir `Predicate` metodudur.
 * - **F:** Doğru, `Runnable` parametre almayan ve bir şey döndürmeyen işlemleri temsil eder.
 * - **G:** Yanlış, `Runnable` parametre almaz, bu nedenle `Runnable<Integer>` geçerli değildir.
 *
 * Çözüm:
 * Doğru şıklar: **C, E, F**
 */
public class AssessmentTest8 {
    public static void main(String[] args) {
        // Predicate örneği
        Predicate<Integer> r = i -> i > 0;
        Predicate<Integer> x = r.negate(); // x, Predicate arayüzünü uygular
        System.out.println("Predicate Test (negate): " + x.test(-5)); // true (çünkü -5 > 0 değil)

        // Runnable örneği
        Runnable y = () -> System.out.println("Runnable executed");
        y.run(); // Çıktı: Runnable executed

        // Comparator örneği
        Comparator<Integer> z = (a, b) -> a - b; // Comparator arayüzü
        System.out.println("Comparator Test: " + z.compare(10, 5)); // 5 (10 - 5)
    }
}