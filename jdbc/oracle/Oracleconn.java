import java.sql.*;

public class Oracleconn
{
	public static void main(String[] args) throws Exception
	{
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded");
			Connection con = DriverManager.getConnection(url,"minal","7284559");
			System.out.println("Connection Established");
			con.close();
	
			
	}	

}




