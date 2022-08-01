import java.sql.*;
import java.util.Scanner;

public class insertPP
{
	static Connection con;
	static String DriverClassName = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3300/emp";
	static String name,stuname;
	static int roll_no,stuno;


	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		Scanner sc = new Scanner(System.in);
		Class.forName(DriverClassName);
		con = DriverManager.getConnection(url,"root","7284559");
		String select = "select * from student";
		String insert = "insert into student values(?,?)";
		PreparedStatement insertps = con.prepareStatement(insert);
		System.out.println("Enter student no:");
		stuno = sc.nextInt();
		System.out.println("Enter student name:");
		stuname = sc.next();
		insertps.setInt(1,stuno); 
		insertps.setString(2,stuname);
		int insertQ = insertps.executeUpdate();
		System.out.println("1 row inserted");
		PreparedStatement ps = con.prepareStatement(select);
		ResultSet rs = ps.executeQuery();
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