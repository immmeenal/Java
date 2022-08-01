import java.sql.*;
import java.util.Scanner;

public class facto
{
	static Connection con;
	static String query = "{? = call FACTORIALP(?)}";
	static String DriverClass = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3300/emp";

	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		Scanner sc =  new Scanner(System.in);
		ResultSet rs;
		Class.forName(DriverClass);
		con = DriverManager.getConnection(url,"root","7284559");
		CallableStatement cs = con.prepareCall(query);
		
		System.out.println("enter 1st number:");
		int one = sc.nextInt();
		cs.setInt(2,one);
		cs.registerOutParameter(1,Types.INTEGER);
		cs.execute();
		rs = cs.getResultSet();
		System.out.println("Factorial: " +cs.getInt(1));
		
		con.close();

	}


}