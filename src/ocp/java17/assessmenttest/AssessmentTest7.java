package ocp.java17.assessmenttest;

import java.util.Arrays;

/**
 * AssessmentTest7
 *
 * Question 7:
 * What is guaranteed to be printed by the following code? (Choose all that apply.)
 *
 * Code:
 * int[] array = {6, 9, 8};
 * System.out.println("B" + Arrays.binarySearch(array, 9));
 * System.out.println("C" + Arrays.compare(array, new int[]{6, 9, 8}));
 * System.out.println("M" + Arrays.mismatch(array, new int[]{6, 9, 8}));
 *
 * Options:
 * A. B1
 * B. B2
 * C. C-1
 * D. C0
 * E. M-1
 * F. M0
 * G. The code does not compile.
 *
 * Soru 7:
 * Aşağıdaki kodun garantili olarak yazdıracağı çıktı nedir? (Birden fazla şık seçilebilir.)
 *
 * Kod:
 * int[] array = {6, 9, 8};
 * System.out.println("B" + Arrays.binarySearch(array, 9));
 * System.out.println("C" + Arrays.compare(array, new int[]{6, 9, 8}));
 * System.out.println("M" + Arrays.mismatch(array, new int[]{6, 9, 8}));
 *
 * Şıklar:
 * A. B1
 * B. B2
 * C. C-1
 * D. C0
 * E. M-1
 * F. M0
 * G. Kod derlenmez.
 *
 * Açıklama:
 * 1. `Arrays.binarySearch(array, 9)`:
 *    - `binarySearch` doğru çalışması için dizinin sıralı olması gerekir.
 *    - Dizimiz `{6, 9, 8}` sıralı değildir, bu nedenle `binarySearch`'in çıktısı doğru olmayabilir.
 *    - Bu durumda sonuç garanti edilemez, dolayısıyla **B şıkları (B1, B2)** garanti edilemez.
 *
 * 2. `Arrays.compare(array, new int[]{6, 9, 8})`:
 *    - Bu metod iki diziyi elemanlarına göre karşılaştırır.
 *    - Diziler tamamen eşitse `0` döner, aksi takdirde negatif veya pozitif bir değer döner.
 *    - Diziler eşit olduğu için sonuç `C0` olacaktır (**D doğru şık**).
 *
 * 3. `Arrays.mismatch(array, new int[]{6, 9, 8})`:
 *    - Bu metod ilk farklı elemanın indeksini döner. Eğer tüm elemanlar eşitse `-1` döner.
 *    - Diziler tamamen eşit olduğu için sonuç `-1` olacaktır (**E doğru şık**).
 *
 * Şıkların değerlendirilmesi:
 * - **A:** Yanlış, `binarySearch` sonucu garanti edilemez.
 * - **B:** Yanlış, `binarySearch` sonucu garanti edilemez.
 * - **C:** Yanlış, diziler eşit olduğu için `C0` döner.
 * - **D:** Doğru, `Arrays.compare` diziler eşit olduğu için `0` döndürür.
 * - **E:** Doğru, `Arrays.mismatch` diziler eşit olduğu için `-1` döndürür.
 * - **F:** Yanlış, çünkü `mismatch` sonucu `0` değil `-1` olacaktır.
 * - **G:** Yanlış, kod başarılı şekilde derlenir ve çalışır.
 *
 * Çözüm:
 * Kod çalıştırıldığında garantili olarak `C0` ve `M-1` yazdırılır.
 */
public class AssessmentTest7 {
    public static void main(String[] args) {
        int[] array = {6, 9, 8};

        // binarySearch (Sonuç garanti edilemez çünkü dizi sıralı değil)
        System.out.println("B" + Arrays.binarySearch(array, 9));

        // compare (Diziler eşit olduğu için 0 döner)
        System.out.println("C" + Arrays.compare(array, new int[]{6, 9, 8}));

        // mismatch (Diziler eşit olduğu için -1 döner)
        System.out.println("M" + Arrays.mismatch(array, new int[]{6, 9, 8}));
    }
}