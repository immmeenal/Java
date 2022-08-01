import java.sql.*;
import java.util.Scanner;

public class updatePP
{
	static Connection con;
	static String DriverClassName = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3300/emp";
	static String name,studname;
	static int roll_no,studroll;

	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		Scanner sc = new Scanner(System.in);
		ResultSet rs;
		Class.forName(DriverClassName);
		con = DriverManager.getConnection(url,"root","7284559");
		String select = "select * from student";
		String update = "update student set name=? where roll_no=?"; 
		PreparedStatement updateps = con.prepareStatement(update);
		System.out.println("enter the name of student");
		studname = sc.next();
		System.out.println("enter the roll no of student");
		studroll = sc.nextInt();
		updateps.setString(1,studname);
		updateps.setInt(2,studroll);
		int updateQ= updateps.executeUpdate();
		PreparedStatement ps = con.prepareStatement(select);
		rs = ps.executeQuery();
		System.out.println("roll_no \t name");
		while(rs.next())
		{
			roll_no = rs.getInt(1);
			name = rs.getString(2);
			System.out.println(roll_no+"\t"+name);
			
		}
		con.close();
		
	}

}