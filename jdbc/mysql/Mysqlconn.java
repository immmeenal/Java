import java.sql.*;

public class Mysqlconn
{
	public static void main(String[] args) throws Exception
	{
		
		String url="jdbc:mysql://localhost:3300/db1";
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			Connection con = DriverManager.getConnection(url,"root","7284559");
			System.out.println("Connection Established");
			con.close();
	
			
	}	

}




