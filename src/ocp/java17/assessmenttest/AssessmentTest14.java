package ocp.java17.assessmenttest;

import java.io.*;

/**
 * AssessmentTest14
 *
 * Question 14:
 * Assume that `birds.dat` exists, is accessible, and contains data for a `Bird` object.
 * What is the result of executing the following code? (Choose all that apply.)
 *
 * Code:
 * import java.io.*;
 * public class Bird implements Serializable {
 *     private String name;
 *     private transient Integer age;
 *     // Getters/Setters omitted
 * }
 *
 * public static void main(String[] args) {
 *     try (var is = new ObjectInputStream(
 *                 new BufferedInputStream(
 *                     new FileInputStream("birds.dat")))) {
 *         Bird b = (Bird) is.readObject();
 *         System.out.println(b.age);
 *     }
 * }
 *
 * Options:
 * A. It compiles and prints 0 at runtime.
 * B. It compiles and prints `null` at runtime.
 * C. It compiles and prints a number at runtime.
 * D. The code will not compile because of lines 9–11.
 * E. The code will not compile because of line

 ```java
 * 12.
 * F. It compiles but throws an exception at runtime.
 *
 * Soru 14:
 * `birds.dat` dosyasının var olduğunu, erişilebilir olduğunu ve bir `Bird` nesnesine ait veriler içerdiğini varsayın.
 * Bu kod çalıştırıldığında sonucu ne olur? (Birden fazla seçenek seçilebilir.)
 *
 * Kod:
 * import java.io.*;
 * public class Bird implements Serializable {
 *     private String name;
 *     private transient Integer age;
 *     // Getters/Setters ihmal edilmiştir
 * }
 *
 * public static void main(String[] args) {
 *     try (var is = new ObjectInputStream(
 *                 new BufferedInputStream(
 *                     new FileInputStream("birds.dat")))) {
 *         Bird b = (Bird) is.readObject();
 *         System.out.println(b.age);
 *     }
 * }
 *
 * Şıklar:
 * A. Kod derlenir ve çalıştırıldığında 0 yazdırır.
 * B. Kod derlenir ve çalıştırıldığında `null` yazdırır.
 * C. Kod derlenir ve çalıştırıldığında bir sayı yazdırır.
 * D. Kod 9–11. satırlar nedeniyle derlenmez.
 * E. Kod 12. satır nedeniyle derlenmez.
 * F. Kod derlenir ancak çalışma zamanında bir istisna atar.
 *
 * Açıklama:
 * 1. **Transient Alanlar ve Serialization:**
 *    - `transient` anahtar kelimesi bir alanın serileştirilmemesini sağlar.
 *    - `age` alanı `transient` olarak işaretlenmiştir, bu nedenle `birds.dat` dosyasından okunurken `age` alanı serileştirilmez.
 * 2. **Çıktı:**
 *    - `age` alanı serileştirilmediği için, çalışma zamanında `null` olacaktır.
 * 3. **Kodun Doğruluğu:**
 *    - Kod derlenir çünkü `ObjectInputStream` ve `readObject()` doğru bir şekilde kullanılmıştır.
 *    - Ancak `birds.dat` dosyası mevcut değilse ya da doğru bir şekilde oluşturulmamışsa çalışma zamanında `FileNotFoundException` veya `ClassNotFoundException` gibi istisnalar atılabilir.
 *
 * Şıkların değerlendirilmesi:
 * - **A:** Yanlış, `age` alanı bir ilkel veri tipi (`int`) olmadığı için 0 değil, `null` döner.
 * - **B:** Doğru, çünkü `age` serileştirilmez ve çalışma zamanında `null` olur.
 * - **C:** Yanlış, çünkü `age` serileştirilmediği için bir sayı yazdırılmaz.
 * - **D:** Yanlış, kod belirtilen satırlarda derlenir.
 * - **E:** Yanlış, kod 12. satırda da derlenir.
 * - **F:** Doğru, çünkü `birds.dat` dosyası mevcut değilse bir istisna fırlatılabilir.
 *
 * Çözüm:
 * Doğru cevap: **B, F**
 */
public class AssessmentTest14 {
    public static void main(String[] args) {
        try (var is = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream("birds.dat")))) {
            Bird b = (Bird) is.readObject();
            System.out.println(b.age); // Çıktı: null (age alanı transient olduğu için)
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}

class Bird implements Serializable {
    private String name;
    transient Integer age;

    // Getter ve Setter'lar (isteğe bağlı olarak eklenebilir)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}