package veritabani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class KayitGetir {

	public static void main(String[] args) {
	
	    try
	    {
	    
	    	String myDriver = "org.postgresql.Driver";
	    	String dbPath = "jdbc:postgresql://localhost:5433/Kraft";
	    	Class.forName(myDriver);
	    	Connection conn = DriverManager.getConnection(dbPath, "postgres", "1234");
	    	System.out.println("bağlantı gerçekleşti");
	    	String sorgu = "select * from kullanici";
	    	Statement st = conn.createStatement();
	    	ResultSet rs = st.executeQuery(sorgu);
	    	while(rs.next())
	    	{
	    		String adi = rs.getString("adi");
	    		String soyadi = rs.getString("soyadi");
	    		System.out.println(adi + " " + soyadi);
	    	}
	    	st.close();
	    	conn.close();
	    	
	    }
	    catch(ClassNotFoundException ex)
	    {
	    	System.out.println("Hata : "+ ex.getMessage().toString());
	    }
	    catch(SQLException ex)
	    {
	    	System.out.println("Hata : Bağlanmak istediğiniz sununcunu kullanı adı veya şifre veya ip si");
	    }
	    catch(Exception ex)
	    {
	    	System.out.println("Hata : "+ ex.getMessage().toString());
	    }

	}

}
