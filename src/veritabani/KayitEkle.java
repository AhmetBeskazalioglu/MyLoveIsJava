package veritabani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class KayitEkle {

	public static void main(String[] args) {
	
		try
		{
			String myDriver = "org.postgresql.Driver";
			String dbPath = "jdbc:postgresql://localhost:5433/Kraft";
	    	Class.forName(myDriver);
	    	Connection conn = DriverManager.getConnection(dbPath, "postgres", "1234");
	    	System.out.println("bağlantı gerçekleşti");
	    	PreparedStatement prStmt = conn.
	    			prepareStatement("insert into kullanici (adi,soyadi,yas) values(?,?,?)");
	    	prStmt.setString(1, "Mert");
	    	prStmt.setString(2, "Yildiz");
	    	prStmt.setInt(3, 43);
	    	int etkilenenKayitSayisi = prStmt.executeUpdate();
	    	if(etkilenenKayitSayisi>0)
	    	{
	    		System.out.println("kayıt eklenmiştir");
	    	}
	    	else
	    	{
	    		System.out.println("kayıt eklenememiştir");
	    	}
	    	prStmt.close();
	    	conn.close();
	    		
		}
		catch(Exception ex)
		{
			System.out.println("hata : " + ex.getMessage().toString());
		}

	}

}
