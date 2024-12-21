package ocp.java17.assessmenttest;

/**
 * AssessmentTest10
 *
 * Question 10:
 * What is the output of the following program? (Choose all that apply.)
 *
 * Code:
 * 1: interface HasTail { private int getTailLength(); }
 * 2: abstract class Puma implements HasTail {
 * 3:     String getTailLength() { return "4"; }
 * 4: }
 * 5: public class Cougar implements HasTail {
 * 6:     public static void main(String[] args) {
 * 7:         var puma = new Puma() {};
 * 8:         System.out.println(puma.getTailLength());
 * 9:     }
 * 10:    public int getTailLength(int length) { return 2; }
 * 11: }
 *
 * Options:
 * A. 2
 * B. 4
 * C. The code will not compile because of line 1.
 * D. The code will not compile because of line 3.
 * E. The code will not compile because of line 5.
 * F. The code will not compile because of line 7.
 * G. The code will not compile because of line 10.
 * H. The output cannot be determined from the code provided.
 *
 * Soru 10:
 * Aşağıdaki programın çıktısı nedir? (Birden fazla seçenek seçilebilir.)
 *
 * Kod:
 * 1: interface HasTail { private int getTailLength(); }
 * 2: abstract class Puma implements HasTail {
 * 3:     String getTailLength() { return "4"; }
 * 4: }
 * 5: public class Cougar implements HasTail {
 * 6:     public static void main(String[] args) {
 * 7:         var puma = new Puma() {};
 * 8:         System.out.println(puma.getTailLength());
 * 9:     }
 * 10:    public int getTailLength(int length) { return 2; }
 * 11: }
 *
 * Şıklar:
 * A. 2
 * B. 4
 * C. Kod, 1. satır nedeniyle derlenmez.
 * D. Kod, 3. satır nedeniyle derlenmez.
 * E. Kod, 5. satır nedeniyle derlenmez.
 * F. Kod, 7. satır nedeniyle derlenmez.
 * G. Kod, 10. satır nedeniyle derlenmez.
 * H. Koddan çıktı belirlenemez.
 *
 * Açıklama:
 * - **Satır 1:** `interface` içerisinde `private` bir metod tanımlanamaz. Bu nedenle kod derlenmez.
 * - **Satır 3:** `String getTailLength()` metodu, `HasTail` arayüzünden miras almaz çünkü imzaları farklıdır (`int` yerine `String` döner).
 * - **Satır 7:** `var` kullanılarak `Puma` sınıfından soyut bir sınıf oluşturulması hatalı değildir.
 * - Bu nedenle **C şıkkı (1. satırdaki hata)** doğru cevaptır. Kod derlenmez.
 *
 * Şıkların değerlendirilmesi:
 * - **A:** Yanlış, çünkü kod derlenmez.
 * - **B:** Yanlış, çünkü kod derlenmez.
 * - **C:** Doğru, çünkü `private int getTailLength()` bir hata oluşturur.
 * - **D:** Yanlış, satır 3'teki metod `String` döndürse de bir derleme hatası oluşturmaz.
 * - **E:** Yanlış, satır 5 geçerlidir.
 * - **F:** Yanlış, soyut sınıftan bir örnek oluşturulabilir.
 * - **G:** Yanlış, satır 10 hatasızdır.
 * - **H:** Yanlış, kod derlenirse sonuç belirlenebilir, ancak derlenmez.
 *
 * Çözüm:
 * Doğru cevap: **C**
 */
public class AssessmentTest10 {
    public static void main(String[] args) {
        System.out.println("This code will not compile due to a private method in the interface.");
        // No executable logic is needed as the code does not compile.
    }
}