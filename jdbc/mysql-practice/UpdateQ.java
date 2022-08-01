import java.sql.*;

public class UpdateQ
{
	static String DriverClassName = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3300/emp";
	static Connection con;
	static String name;
	static int roll_no;


	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		ResultSet rs;
		Class.forName(DriverClassName);
		con= DriverManager.getConnection(url,"root","7284559");
		Statement st = con.createStatement();
		String update = "update student set name='sham' where roll_no=12";
		String select = "select * from student";
		System.out.println("roll_no\tname");
		rs = st.executeQuery(select);
		while(rs.next())
		{
			roll_no= rs.getInt(1);
			name = rs.getString(2);
			System.out.println(roll_no +"\t"+name);
		}
		int updateQ = st.executeUpdate(update);
		rs = st.executeQuery(select);
		while(rs.next())
		{
			roll_no= rs.getInt(1);
			name = rs.getString(2);
			System.out.println(roll_no +"\t"+name);
		}
		con.close();

		
	}

}