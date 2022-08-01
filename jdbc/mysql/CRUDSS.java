import java.sql.*;
import java.util.Scanner;

public class CRUDSS
{
	static Connection con;
	static int ch;
	static String driverClassName = "com.mysql.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3300/emp";
	static String selectQ = "SELECT * FROM emp";
	static String eid,ename,esalary;
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
	
		Scanner sc = new Scanner(System.in);
		//load driver class
		Class.forName(driverClassName);
		//obtain a connection
		con = DriverManager.getConnection(url,"root","7284559");
		
	while(true)
	{
	System.out.println(" 1. create employee \n 2. update employee info \n 3. delete employee \n 0. Exit \n enter your choice: ");
	
	ch = sc.nextInt();
	switch (ch)
	{
		case 1:
		createEmp();
		break;
		case 2:
		updateEmp();
		break;
		case 3:
		deleteEmp();
		break;
		case 0:
		System.exit(0);
		default:
                 	System.out.println("Invalid choice! Please make a valid choice. \n\n");
	}
	}
		
}
	private static void createEmp() throws SQLException, ClassNotFoundException
	{
		ResultSet rs;
		String insertQ = "INSERT INTO emp VALUES ('e101','Minal','60000')"; 
		
		//obtain a statement
		Statement stcreate = con.createStatement();
		rs = stcreate.executeQuery(selectQ);
		System.out.println("Employee table before Insertion");
		System.out.println("EmpId \t Empname \t EmpSalary");
		while(rs.next())
		{
			eid = rs.getString(1);
			ename = rs.getString(2);
			esalary = rs.getString(3);
			System.out.println(eid +"\t"+ ename+ "\t"+ esalary);
		}
		int exeUpdate = stcreate.executeUpdate(insertQ);
		if(exeUpdate == 1)
		{
			System.out.println("1 row inserted");
		}
		rs = stcreate.executeQuery(selectQ);
		System.out.println("Employee table after Insertion");
		System.out.println("EmpId \t Empname \t EmpSalary");
		while(rs.next())
		{
			eid = rs.getString(1);
			ename = rs.getString(2);
			esalary = rs.getString(3);
			System.out.println(eid +"\t"+ ename+ "\t"+ esalary);
		}
		stcreate.close();
	}
	private static void updateEmp() throws SQLException, ClassNotFoundException
	{
		ResultSet rs;
		String updateQ = "UPDATE emp SET salary= '70000' WHERE id = 'e101'"; 
		
		
		//obtain a statement
		Statement stupdate = con.createStatement();
		rs = stupdate.executeQuery(selectQ);
		System.out.println("Employee table before Updation");
		System.out.println("EmpId \t Empname \t EmpSalary");
		while(rs.next())
		{
			eid = rs.getString(1);
			ename = rs.getString(2);
			esalary = rs.getString(3);
			System.out.println(eid +"\t"+ ename+ "\t"+ esalary);
		}
		int exeUpdate1 = stupdate.executeUpdate(updateQ);
		if(exeUpdate1 == 1)
		{
			System.out.println("1 row updated");
		}
		rs = stupdate.executeQuery(selectQ);
		System.out.println("Employee table after Updation");
		System.out.println("EmpId \t Empname \t EmpSalary");
		while(rs.next())
		{
			eid = rs.getString(1);
			ename = rs.getString(2);
			esalary = rs.getString(3);
			System.out.println(eid +"\t"+ ename+ "\t"+ esalary);
		}
		stupdate.close();
	}
	private static void deleteEmp() throws SQLException, ClassNotFoundException
	{
		ResultSet rs;
		String deleteQ = " 	DELETE FROM emp WHERE id = 'e101'"; 
		
		
		//obtain a statement
		Statement stdelete = con.createStatement();
		rs = stdelete.executeQuery(selectQ);
		System.out.println("Employee table before deletion");
		System.out.println("EmpId \t Empname \t EmpSalary");
		while(rs.next())
		{
			eid = rs.getString(1);
			ename = rs.getString(2);
			esalary = rs.getString(3);
			System.out.println(eid +"\t"+ ename+ "\t"+ esalary);
		}
		int exeUpdate1 = stdelete.executeUpdate(deleteQ);
		if(exeUpdate1 == 1)
		{
			System.out.println("Employee is deleted");
		}
		rs = stdelete.executeQuery(selectQ);
		System.out.println("Employee table after deletion");
		System.out.println("EmpId \t Empname \t EmpSalary");
		while(rs.next())
		{
			eid = rs.getString(1);
			ename = rs.getString(2);
			esalary = rs.getString(3);
			System.out.println(eid +"\t"+ ename+ "\t"+ esalary);
		}
		stdelete.close();
	}
}