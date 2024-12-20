package ocp.java17.assessmenttest;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.IntStream;

/**
 * AssessmentTest3
 *
 * Question 3:
 * Which changes, when made independently, guarantee the following code snippet prints 100 at runtime? (Choose all that apply.)
 *
 * List<Integer> data = new ArrayList<>();
 * IntStream.range(0,100).parallel().forEach(s -> data.add(s));
 * System.out.println(data.size());
 *
 * Options:
 * A. Change `data` to an instance variable and mark it `volatile`.
 * B. Remove `parallel()` in the stream operation.
 * C. Change `forEach()` to `forEachOrdered()` in the stream operation.
 * D. Change `parallel()` to `serial()` in the stream operation.
 * E. Wrap the lambda body with a `synchronized` block.
 * F. The code snippet will always print 100 as is.
 *
 * Soru 3:
 * Aşağıdaki kod parçacığının çıktısının her zaman 100 olmasını garanti altına almak için hangi değişiklikler bağımsız olarak yapılabilir? (Birden fazla şık seçilebilir.)
 *
 * List<Integer> data = new ArrayList<>();
 * IntStream.range(0,100).parallel().forEach(s -> data.add(s));
 * System.out.println(data.size());
 *
 * Şıklar:
 * A. `data` değişkenini bir örnek değişkenine dönüştürüp `volatile` olarak işaretleme.
 * B. Stream işleminde `parallel()` fonksiyonunu kaldırma.
 * C. Stream işleminde `forEach()`'i `forEachOrdered()` ile değiştirme.
 * D. Stream işleminde `parallel()`'i `serial()` ile değiştirme.
 * E. Lambda gövdesini bir `synchronized` blokla sarmalama.
 * F. Kod, olduğu gibi her zaman 100 yazdırır.
 *
 * Açıklama:
 * - Kodun mevcut haliyle her zaman 100 yazdırması garanti değildir. Bunun nedeni `data` değişkeninin `ArrayList` olması ve thread-safe olmamasıdır.
 * - Paralel işlem sırasında birden fazla thread aynı anda `data.add(s)` metoduna erişir ve veri tutarsızlığına neden olabilir.
 * - Şıkların değerlendirilmesi:
 *   - **A:** `volatile` işaretlemek veri erişimini thread-safe yapmaz. Bu nedenle geçerli değildir.
 *   - **B:** `parallel()`'i kaldırmak, işlemi seri hale getirir ve sonucu garanti altına alır.
 *   - **C:** `forEachOrdered()` sıralı işlem yapılmasını sağlar ancak veri ekleme sırasında thread güvenliği sağlamaz.
 *   - **D:** `parallel()` yerine `serial()` kullanımı sonucu garanti eder.
 *   - **E:** `synchronized` blok kullanımı thread güvenliğini sağlar ve doğru bir çözüm olabilir.
 *   - **F:** Kod olduğu gibi her zaman 100 yazdırmaz, çünkü thread güvenliği yoktur.
 *
 * Çözüm:
 * 1. Thread-safe koleksiyon (örneğin `CopyOnWriteArrayList`) kullanımı.
 * 2. Paralel işlem yerine seri işleme geçiş.
 * 3. Lambda gövdesini `synchronized` ile sarmalama.
 */
public class AssessmentTest3 {
    public static void main(String[] args) {
        // Orijinal Kod
        System.out.println("Orijinal Kod Çalıştırması (Thread-safe değil, sonuç değişebilir):");
        List<Integer> originalData = new ArrayList<>();
        IntStream.range(0, 100).parallel().forEach(s -> originalData.add(s));
        System.out.println("Size (Original): " + originalData.size());

        // Yöntem 1: Thread-safe bir koleksiyon kullanımı
        System.out.println("\nYöntem 1: CopyOnWriteArrayList Kullanımı:");
        List<Integer> data = new CopyOnWriteArrayList<>();
        IntStream.range(0, 100).parallel().forEach(s -> data.add(s));
        System.out.println("Size (CopyOnWriteArrayList): " + data.size());

        // Yöntem 2: Paralel işlem yerine seri işlem
        System.out.println("\nYöntem 2: Paralel işlem yerine seri işlem:");
        List<Integer> data2 = new ArrayList<>();
        IntStream.range(0, 100).forEach(s -> data2.add(s));
        System.out.println("Size (Serial): " + data2.size());

        // Yöntem 3: Lambda gövdesini synchronized ile sarmalama
        System.out.println("\nYöntem 3: Lambda gövdesini synchronized ile sarmalama:");
        List<Integer> data3 = new ArrayList<>();
        IntStream.range(0, 100).parallel().forEach(s -> {
            synchronized (data3) {
                data3.add(s);
            }
        });
        System.out.println("Size (Synchronized): " + data3.size());
    }
}
