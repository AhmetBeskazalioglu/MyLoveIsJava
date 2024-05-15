package veritabani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaglantiOrnek {

	public static void main(String[] args) {
		
		try
		{
			//çalışmasını düşündüğümüz kodların yazıldığı bölüm
		
			System.out.println("Sürücü kurulu");
			
		}
		catch(Exception ex)
		{
			System.out.println("Sürücü kurulu değil");
		}

		Connection connection=null;
		try
		{
			
		   connection = DriverManager
				   .getConnection("jdbc:postgresql://localhost:5433/Kraft", "postgress", "1234");
		   System.out.println("Bağlantı sağlandı");
		}
		catch(SQLException ex)
		{
			System.out.println("Lütfen kullanıcı adınızı veya şifrenizi doğru yazınız");
		}
		catch(Exception ex)
		{
			System.out.println("sistemsel bir hata oluştu");
		}
		finally {
			
			try
			{
			if(connection !=null)
			{
				connection.close();
			}
			}
			catch(Exception ex)
			{
				System.out.println("sistemsel bir hata oluştu");
			}
		}
		
	}

}
