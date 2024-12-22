package ocp.java17.assessmenttest;

import java.sql.*;

/**
 * AssessmentTest12
 *
 * Question 12:
 * Which of the following can fill in the blanks in order to make this code compile?
 *
 * Code:
 * _________ a = _________.getConnection(url, userName, password);
 * _________ b = a.prepareStatement(sql);
 * _________ c = b.executeQuery();
 * if (c.next())
 *     System.out.println(c.getString(1));
 *
 * Options:
 * A. Connection, Driver, PreparedStatement, ResultSet
 * B. Connection, DriverManager, PreparedStatement, ResultSet
 * C. Connection, DataSource, PreparedStatement, ResultSet
 * D. Driver, Connection, PreparedStatement, ResultSet
 * E. DriverManager, Connection, PreparedStatement, ResultSet
 * F. DataSource, Connection, PreparedStatement, ResultSet
 *
 * Soru 12:
 * Aşağıdaki kodun derlenmesi için boşlukları hangi ifadeler doldurabilir?
 *
 * Kod:
 * _________ a = _________.getConnection(url, userName, password);
 * _________ b = a.prepareStatement(sql);
 * _________ c = b.executeQuery();
 * if (c.next())
 *     System.out.println(c.getString(1));
 *
 * Şıklar:
 * A. Connection, Driver, PreparedStatement, ResultSet
 * B. Connection, DriverManager, PreparedStatement, ResultSet
 * C. Connection, DataSource, PreparedStatement, ResultSet
 * D. Driver, Connection, PreparedStatement, ResultSet
 * E. DriverManager, Connection, PreparedStatement, ResultSet
 * F. DataSource, Connection, PreparedStatement, ResultSet
 *
 * Açıklama:
 * - JDBC kullanılarak bir veritabanına bağlanırken:
 *   1. `DriverManager.getConnection()` metoduyla bir bağlantı (`Connection`) oluşturulur.
 *   2. `Connection.prepareStatement(sql)` ile bir SQL sorgusu hazırlamak için bir `PreparedStatement` oluşturulur.
 *   3. `PreparedStatement.executeQuery()` ile sorgu çalıştırılır ve sonuçlar bir `ResultSet` nesnesi olarak döndürülür.
 * - **DriverManager**, bağlantıyı başlatmak için kullanılır.
 *
 * **Boşlukların Doldurulması:**
 * 1. `Connection a = DriverManager.getConnection(url, userName, password);`
 * 2. `PreparedStatement b = a.prepareStatement(sql);`
 * 3. `ResultSet c = b.executeQuery();`
 *
 * Şıkların değerlendirilmesi:
 * - **A:** Yanlış, çünkü `Driver` nesnesi kullanılmaz.
 * - **B:** Doğru, `DriverManager` bir bağlantı (`Connection`) sağlar.
 * - **C:** Yanlış, `DataSource` genelde daha ileri seviyede bir yönetim sağlar, burada kullanılmaz.
 * - **D:** Yanlış, çünkü `Driver` ve `Connection` sırası tersdir.
 * - **E:** Yanlış, çünkü ilk boşlukta `DriverManager` yerine `Connection` yazılmalı.
 * - **F:** Yanlış, `DataSource` kullanılmaz.
 *
 * Çözüm:
 * Doğru cevap: **B**
 */
public class AssessmentTest12 {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String userName = "root";
            String password = "password";
            String sql = "SELECT * FROM my_table";

            Connection a = DriverManager.getConnection(url, userName, password);
            PreparedStatement b = a.prepareStatement(sql);
            ResultSet c = b.executeQuery();

            while (c.next()) {
                System.out.println(c.getString(1)); // İlk sütunun değerini yazdır
            }

            c.close();
            b.close();
            a.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}