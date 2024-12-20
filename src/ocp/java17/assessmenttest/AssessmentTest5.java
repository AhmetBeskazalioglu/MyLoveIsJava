package ocp.java17.assessmenttest;

/**
 * AssessmentTest5
 *
 * Question 5:
 * What is the result of the following program?
 *
 * 1: public class MathFunctions {
 * 2:     public static void addToInt(int x, int amountToAdd) {
 * 3:         x = x + amountToAdd;
 * 4:     }
 * 5:     public static void main(String[] args) {
 * 6:         var a = 15;
 * 7:         var b = 10;
 * 8:         MathFunctions.addToInt(a, b);
 * 9:         System.out.println(a);
 * 10:    }
 * 11: }
 *
 * Options:
 * A. 10
 * B. 15
 * C. 25
 * D. Compiler error on line 3
 * E. Compiler error on line 8
 * F. None of the above
 *
 * Soru 5:
 * Aşağıdaki programın sonucu nedir?
 *
 * 1: public class MathFunctions {
 * 2:     public static void addToInt(int x, int amountToAdd) {
 * 3:         x = x + amountToAdd;
 * 4:     }
 * 5:     public static void main(String[] args) {
 * 6:         var a = 15;
 * 7:         var b = 10;
 * 8:         MathFunctions.addToInt(a, b);
 * 9:         System.out.println(a);
 * 10:    }
 * 11: }
 *
 * Şıklar:
 * A. 10
 * B. 15
 * C. 25
 * D. 3. satırda derleme hatası
 * E. 8. satırda derleme hatası
 * F. Hiçbiri
 *
 * Açıklama:
 * - Java, **pass-by-value** (değerle geçirme) yöntemini kullanır. Yani `addToInt` metoduna `a` değişkeninin sadece değeri kopyalanır.
 * - `x` değişkeni metot içinde değişse bile bu değişiklik, `main` metodundaki `a` değişkenini etkilemez.
 * - Bu nedenle `System.out.println(a);` ifadesi `15` yazdırır.
 *
 * Şıkların değerlendirilmesi:
 * - **A:** Yanlış, çünkü `a` değişkeni değişmez.
 * - **B:** Doğru, çünkü `a` değişkeni 15 olarak kalır.
 * - **C:** Yanlış, `addToInt` metodundaki değişiklik `a`'yı etkilemez.
 * - **D:** Yanlış, 3. satırdaki kod hatasızdır.
 * - **E:** Yanlış, 8. satırda da bir hata yoktur.
 * - **F:** Yanlış, çünkü doğru cevap B'dir.
 *
 * Çözüm:
 * Kodun doğru bir şekilde derlenmesi ve çalıştırılması sonucu ekrana `15` yazdırılır.
 */
public class AssessmentTest5 {
    public static void addToInt(int x, int amountToAdd) {
        x = x + amountToAdd; // x sadece bu metodun içinde değişir
    }

    public static void main(String[] args) {
        var a = 15;
        var b = 10;
        AssessmentTest5.addToInt(a, b); // a'nın değeri değişmez
        System.out.println(a); // Çıktı: 15
    }
}
