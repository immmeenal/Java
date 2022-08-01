import java.sql.*;
import java.util.Scanner;

public class PreparedDemo {

	public static Connection con;

	void printTable() {
		PreparedStatement printTbl;

		String query = "SELECT * FROM student";
		try {
			System.out.println("\n\nPrinting Table : \n");
			printTbl = PreparedDemo.con.prepareStatement(query);

			ResultSet rs = printTbl.executeQuery();

			System.out.println("RollNo\tName\tMarks");
			while (rs.next()) {
				int roll = rs.getInt(1);
				String name = rs.getString(2);
				int mark = rs.getInt(3);
				System.out.println(roll + "\t" + name + "\t" + mark);
			}
			System.out.println("\n");
			printTbl.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	void insertInTable(int roll, String name, int marks) {
		PreparedStatement insertTbl;

		String query = "INSERT INTO student VALUES(?,?,?)";
		try {

			insertTbl = PreparedDemo.con.prepareStatement(query);

			insertTbl.setInt(1, roll);
			insertTbl.setString(2, name);
			insertTbl.setInt(3, marks);

			int i = insertTbl.executeUpdate();

			insertTbl.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	void updateTable(int roll, int marks) {
		PreparedStatement updateTbl;

		String query = "update student set marks=? where roll_no=? ";
		try {
			updateTbl = PreparedDemo.con.prepareStatement(query);

			updateTbl.setInt(1, marks);

			updateTbl.setInt(2, roll);

			int i = updateTbl.executeUpdate();
			updateTbl.close();

		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	void deleteData(int roll) {
		PreparedStatement delete;

		String query = "delete from student where roll_no = ?";
		try {
			delete = PreparedDemo.con.prepareStatement(query);

			delete.setInt(1, roll);

			int i = delete.executeUpdate();

			delete.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public static void main(String args[]) {
		PreparedDemo pd;

		try {
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			PreparedDemo.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javajdbc", "root", "password");
			pd = new PreparedDemo();

			while (true) {
				System.out.println("1. Print table\n2. Insert table\n3. Update Data(marks)\n4. Delete Data\n5. Exit\n");
				int i = sc.nextInt();
				int roll_no, marks;
				String name;
				switch (i) {
					case 1:
						pd.printTable();
						break;

					case 2:
						System.out.println("Enter roll no");
						roll_no = sc.nextInt();
						System.out.println("\nEnter name");
						name = sc.next();
						System.out.println("\nEnter marks");
						marks = sc.nextInt();
						pd.insertInTable(roll_no, name, marks);
						pd.printTable();
						break;
					case 3:
						System.out.println("Enter roll no");
						roll_no = sc.nextInt();
						System.out.println("\nEnter marks");
						marks = sc.nextInt();
						pd.updateTable(roll_no, marks);
						pd.printTable();
						break;
					case 4:
						System.out.println("Enter roll no");
						roll_no = sc.nextInt();
						pd.deleteData(roll_no);
						pd.printTable();
						break;
					case 5:
						break;

					default:
						break;
				}
			}

		} catch (Exception e) {
			System.out.println(" main" + e);
		}
	}
}
