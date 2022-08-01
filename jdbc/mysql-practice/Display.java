import java.sql.*;

public class Display
{

	static Connection con;
	static String DriverClassName = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3300/emp";
	static String name;
	static int roll_no;
	static String select = "Select * from student";

	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		Class.forName(DriverClassName);
		con = DriverManager.getConnection(url,"root","7284559");
		Statement st  = con.createStatement();
		ResultSet rs;
		rs = st.executeQuery(select);
		System.out.println("roll_no\tname");
		while(rs.next())
		{
			roll_no = rs.getInt(1);
			name = rs.getString(2);
			System.out.println(roll_no+"\t"+name);
		}
		con.close();
	}

}