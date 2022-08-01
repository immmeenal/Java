import java.sql.*;
import java.util.*;

class SqlTest1
{
	public static void main(String[] args)throws Exception
	{
		//load driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");
		
		Statement smt = con.createStatement();
		String query = "CREATE TABLE empll(Empid VARCHAR(30),Empname VARCHAR(30),Empsal VARCHAR(30))";
		int i = smt.executeUpdate(query);

		query = "INSERT INTO empll VALUES(1,'Minal',5000)";
		i = smt.executeUpdate(query);

		query = "SELECT * FROM empll";

		ResultSet rs = smt.executeQuery(query);

		System.out.println("EmpID\tEmpName\tEmpMarks");
		while (rs.next()) {
			int id = rs.getString(1);
			String name = rs.getString(2);
			int sal = rs.getString(3);
			System.out.println(id + "\t" + name + "\t" + sal);
		}

		smt.close();
		con.close();
		
	}

}