package designpatterns.singleton.enumsingleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum EnumSingleton {

    //	 Enum Singleton Design Pattern in avantajları
    //1. Thread safe
    //2. Serialization problemi yok
    //3. Double checked locking problemi yok
    //4. Enum singletonlar lazy initialization yaparlar
    //5. Enum singletonlar enum classlar gibi final ve immutabledır
    //6. Enum singletonlar garbage collector tarafından yok edilemezler
    //7. Enum singletonlar her zaman bir instance dönerler


    INSTANCE;

    private Connection connection;

    private EnumSingleton() {
        try {
            String myDriver = "org.postgresql.Driver";
            String dbPath = "jdbc:postgresql://localhost:5433/Kraft";
            Class.forName(myDriver);
            connection = DriverManager.getConnection(dbPath, "postgres", "1234");
            System.out.println("Bağlantı gerçekleşti");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }
}