package ocp.java17.assessmenttest;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * AssessmentTest4
 *
 * Question 4:
 * What is the output of the following code?
 *
 * Predicate<String> empty = String::isEmpty;
 * Predicate<String> notEmpty = empty.negate();
 * var result = Stream.generate(() -> "")
 *     .filter(notEmpty)
 *     .collect(Collectors.groupingBy(k -> k))
 *     .entrySet()
 *     .stream()
 *     .map(Entry::getValue)
 *     .flatMap(Collection::stream)
 *     .collect(Collectors.partitioningBy(notEmpty));
 * System.out.println(result);
 *
 * Options:
 * A. It outputs `{}`.
 * B. It outputs `{false=[], true=[]}`.
 * C. The code does not compile.
 * D. The code does not terminate.
 *
 * Soru 4:
 * Aşağıdaki kodun çıktısı nedir?
 *
 * Predicate<String> empty = String::isEmpty;
 * Predicate<String> notEmpty = empty.negate();
 * var result = Stream.generate(() -> "")
 *     .filter(notEmpty)
 *     .collect(Collectors.groupingBy(k -> k))
 *     .entrySet()
 *     .stream()
 *     .map(Entry::getValue)
 *     .flatMap(Collection::stream)
 *     .collect(Collectors.partitioningBy(notEmpty));
 * System.out.println(result);
 *
 * Şıklar:
 * A. `{}` çıktısını verir.
 * B. `{false=[], true=[]}` çıktısını verir.
 * C. Kod derlenmez.
 * D. Kod sonlanmaz.
 *
 * Açıklama:
 * - Kodda `Stream.generate(() -> "")` ifadesi sonsuz bir `Stream` oluşturur. Her üretilen değer boş bir stringdir (`""`).
 * - `notEmpty` filtresi boş string olmayanları seçmek için kullanılır, ancak tüm üretilen stringler zaten boştur. Bu nedenle filtre hiçbir elemanı geçirmez.
 * - Kod sonsuz bir döngüye girer ve **D: Kod sonlanmaz** şıkkı doğru cevaptır.
 * - Çözüm için `limit()` kullanılarak stream sınırlandırılabilir.
 *
 * Çözüm:
 * - Sonsuz stream'i sınırlandırmak için `Stream.generate(() -> "").limit(10)` eklenmiştir.
 */
public class AssessmentTest4 {
    public static void main(String[] args) {
        // Orijinal Kod
        System.out.println("Orijinal Kod Çalıştırması (Sonsuz döngü, çalıştırmayın!):");
        /*
        Predicate<String> empty = String::isEmpty;
        Predicate<String> notEmpty = empty.negate();
        var result = Stream.generate(() -> "")
            .filter(notEmpty)
            .collect(Collectors.groupingBy(k -> k))
            .entrySet()
            .stream()
            .map(Map.Entry::getValue)
            .flatMap(Collection::stream)
            .collect(Collectors.partitioningBy(notEmpty));
        System.out.println(result);
        */

        // Çözüm: Stream'e limit eklenmesi
        System.out.println("\nÇözüm: Stream'e limit eklenerek çalıştırma:");
        Predicate<String> empty = String::isEmpty;
        Predicate<String> notEmpty = empty.negate();
        var result = Stream.generate(() -> "") // Sonsuz stream oluşturuluyor
                .limit(10) // Stream'i 10 elemanla sınırla
                .filter(notEmpty) // Boş olmayanları filtrele (ama tüm stringler boş)
                .collect(Collectors.groupingBy(k -> k)) // Stringleri gruplandır
                .entrySet() // Grupları set haline getir
                .stream() // Set üzerinden stream oluştur
                .map(Map.Entry::getValue) // Grupların değerlerini al
                .flatMap(Collection::stream) // Grupları düzleştir
                .collect(Collectors.partitioningBy(notEmpty)); // Boş olmayanlara göre ayır
        System.out.println(result); // Sonuç: {false=[], true=[]}
    }
}
