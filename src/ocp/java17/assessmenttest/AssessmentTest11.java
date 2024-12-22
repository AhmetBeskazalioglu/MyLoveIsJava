package ocp.java17.assessmenttest;

/**
 * AssessmentTest11
 *
 * Question 11:
 * Which lines in Tadpole.java give a compiler error? (Choose all that apply.)
 *
 * Tadpole.java:
 * 1: package other;
 * 2: import animal.*;
 * 3: public class Tadpole extends Frog {
 * 4:     public static void main(String[] args) {
 * 5:         Tadpole t = new Tadpole();
 * 6:         t.ribbit();
 * 7:         t.jump();
 * 8:         Frog f = new Tadpole();
 * 9:         f.ribbit();
 * 10:        f.jump();
 * 11:     }
 * 12: }
 *
 * Options:
 * A. Line 5
 * B. Line 6
 * C. Line 7
 * D. Line 8
 * E. Line 9
 * F. Line 10
 * G. All of the lines compile.
 *
 * Soru 11:
 * Tadpole.java dosyasındaki hangi satırlar bir derleyici hatası verir? (Birden fazla seçenek seçilebilir.)
 *
 * Tadpole.java:
 * 1: package other;
 * 2: import animal.*;
 * 3: public class Tadpole extends Frog {
 * 4:     public static void main(String[] args) {
 * 5:         Tadpole t = new Tadpole();
 * 6:         t.ribbit();
 * 7:         t.jump();
 * 8:         Frog f = new Tadpole();
 * 9:         f.ribbit();
 * 10:        f.jump();
 * 11:     }
 * 12: }
 *
 * Şıklar:
 * A. 5. Satır
 * B. 6. Satır
 * C. 7. Satır
 * D. 8. Satır
 * E. 9. Satır
 * F. 10. Satır
 * G. Tüm satırlar derlenir.
 *
 * Açıklama:
 * - **protected** erişim seviyesi, aynı paketteki sınıflar ve alt sınıflar tarafından erişilebilir.
 * - Ancak `ribbit()` metodu **protected** olduğu için, `Tadpole` sınıfı içinde erişilebilir. **Frog** referansı üzerinden erişim sağlanamaz.
 * - **default (package-private)** erişim seviyesi sadece aynı paketteki sınıflar için geçerlidir. Bu nedenle, `jump()` metodu başka bir paketten erişilemez.
 *
 * **Satır Satır İnceleme:**
 * - **Line 5:** Geçerli, `Tadpole` nesnesi oluşturuluyor.
 * - **Line 6:** Geçerli, `ribbit()` metodu alt sınıfta çağrılabilir.
 * - **Line 7:** Derleme hatası, `jump()` metodu `default` olduğundan başka bir paketten erişilemez.
 * - **Line 8:** Geçerli, `Frog` referansı ile `Tadpole` nesnesi oluşturulabilir.
 * - **Line 9:** Derleme hatası, `ribbit()` metodu alt sınıf referansı üzerinden çağrılamaz.
 * - **Line 10:** Derleme hatası, `jump()` metodu `default` erişime sahip olduğundan çağrılamaz.
 *
 * Şıkların değerlendirilmesi:
 * - **A:** Yanlış, çünkü 5. satır hatasızdır.
 * - **B:** Yanlış, çünkü 6. satır hatasızdır.
 * - **C:** Doğru, çünkü 7. satır `jump()` metoduna erişmeye çalışır ve bu mümkün değildir.
 * - **D:** Yanlış, çünkü 8. satır hatasızdır.
 * - **E:** Doğru, çünkü 9. satır `ribbit()` metoduna alt sınıf referansı üzerinden erişmeye çalışır.
 * - **F:** Doğru, çünkü 10. satır `jump()` metoduna erişmeye çalışır ve bu mümkün değildir.
 * - **G:** Yanlış, çünkü bazı satırlar derlenmez.
 *
 * Çözüm:
 * Doğru cevap: **C, E, F**
 */
class Tadpole extends Frog {
    public static void main(String[] args) {
        Tadpole t = new Tadpole(); // Geçerli
        t.ribbit(); // Geçerli
        // t.jump(); // Derleme hatası: jump() default erişim seviyesi nedeniyle çağrılamaz.

        Frog f = new Tadpole(); // Geçerli
        // f.ribbit(); // Derleme hatası: ribbit() protected olduğu için erişilemez.
        // f.jump(); // Derleme hatası: jump() default erişim seviyesi nedeniyle çağrılamaz.
    }
}

/**
 * Frog.java
 *
 * package animal;
 * public class Frog {
 *     protected void ribbit() { }
 *     void jump() { }
 * }
 */

class Frog {
    protected void ribbit() { }
    void jump() { }
}

public class AssessmentTest11 {
}