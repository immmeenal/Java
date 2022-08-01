import java.sql.*;
import java.util.Scanner;

public class collablepf
{
	static Connection con;
	static String DriverClass = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3300/emp";
	static String Query = "{call DISPLAYP()}";
	static String UpdateQ = "{call INOUTPP(?,?)}";
	static String name;
	static int roll_no;

	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		Scanner sc = new Scanner(System.in);
		ResultSet rs;
		Class.forName(DriverClass);
		con = DriverManager.getConnection(url,"root","7284559");
		CallableStatement csinout = con.prepareCall(UpdateQ);
		System.out.println("Enter the stud enroll:");
		int studroll = sc.nextInt();
		csinout.setInt(2,studroll);
		csinout.registerOutParameter(1,Types.INTEGER);
		csinout.execute();
		System.out.println("Count of stud: "+csinout.getInt(1));
		CallableStatement cs = con.prepareCall(Query);
		cs.executeQuery();
		rs = cs.getResultSet();
		System.out.println("roll_no \t name");
		while(rs.next())
		{
			roll_no = rs.getInt(1);
			name = rs.getString(2);
			
		System.out.println(roll_no+" \t"+ name);
		}
		con.close();
		
	}

}