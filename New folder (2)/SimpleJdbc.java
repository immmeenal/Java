import java.sql.*;

public class SimpleJdbc {

	public static void main(String ages[]) throws Exception {
		String query;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javajdbc", "root", "password");

		Statement smt = con.createStatement();
		// String query = "CREATE TABLE student(roll_no INT,name VARCHAR(30),marks
		// INT)";
		// int i = smt.executeUpdate(query);

		query = "INSERT INTO student VALUES(1,'Akshay',95)";
		// i = smt.executeUpdate(query);

		query = "SELECT * FROM student";

		ResultSet rs = smt.executeQuery(query);

		System.out.println("RollNo\tName\tMarks");
		while (rs.next()) {
			int roll = rs.getInt(1);
			String name = rs.getString(2);
			int mark = rs.getInt(3);
			System.out.println(roll + "\t" + name + "\t" + mark);
		}

		smt.close();
		con.close();
	}

}
