import java.sql.*;

public class InsertStud
{
	static String DriverClassName= "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3300/emp";
	static Connection con;
	static int roll_no;
	static String name;
	static String select ="Select * from Student";

	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		Class.forName(DriverClassName);
		con = DriverManager.getConnection(url,"root","7284559");

		ResultSet rs;

		String insert = "insert into student values(11,'XYZ')";
		String insert2 = "insert into student values(12,'PQR')";
		
		Statement st = con.createStatement();
		rs = st.executeQuery(select);
		System.out.println("roll_no \t name");
		while(rs.next())
		{
			roll_no = rs.getInt(1);
			name = rs.getString(2);
			System.out.println(roll_no +"\t"+name);
		}
		int insertQ = st.executeUpdate(insert);
		int insertQ2 = st.executeUpdate(insert2);
		rs = st.executeQuery(select);
		System.out.println("roll_no \t name");
		while(rs.next())
		{
			roll_no = rs.getInt(1);
			name = rs.getString(2);
			System.out.println(roll_no +"\t"+name);
		}
		con.close();
	

	}

}