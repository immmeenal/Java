import java.sql.*;
import java.util.Scanner;

public class CRUDPS
{
	static Connection con;
	static int ch;
	static String driverClassName = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String selectQ = "SELECT * FROM empll";
	static String id,name,sal;
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		CRUDPS crudps= new CRUDPS();//obj of class
	
		Scanner sc = new Scanner(System.in);
		//load driver class
		Class.forName(driverClassName);
		//obtain a connection
		con = DriverManager.getConnection(url,"system","7284559");
		
	while(true)
	{
	System.out.println("1. print employee table \n 2. create employee \n 3. update employee info \n 4. delete employee \n 0. Exit \n enter your choice: ");
	
	ch = sc.nextInt();
	switch (ch)
	{
		case 1:
		crudps.printEmp();
		break;
		case 2:
		System.out.println("Enter Emp Id: ");
		id = sc.next();
		System.out.println("\nEnter Name");
		name = sc.next();
		System.out.println("\nEnter Salary");
		sal= sc.next();
		crudps.createEmp(id, name, sal);
		crudps.printEmp();
		break;
		case 3:
		System.out.println("Enter Emp Id: ");
		id = sc.next();
		System.out.println("\nEnter Name");
		name = sc.next();
		crudps.updateEmp(id, name);
		crudps.printEmp();
		break;
		case 4:
		System.out.println("Enter Emp Id: ");
		id = sc.next();
		crudps.deleteEmp(id);
		crudps.printEmp();
		break;
		case 0:
		System.exit(0);
		default:
                 	System.out.println("Invalid choice! Please make a valid choice. \n\n");
	}
	}
		
}
	void printEmp() throws SQLException, ClassNotFoundException
	{
		PreparedStatement printps;
		ResultSet rs;
		String printQ = "select * from empll";
		printps=con.prepareStatement(printQ);
		rs = printps.executeQuery();
		System.out.println("\n\nPrinting Table : \n");
		System.out.println("empID \t empNAME \t empSALARY");
		while(rs.next())
		{
			id=rs.getString(1);
			name=rs.getString(2);
			sal=rs.getString(3);
			System.out.println(id +"\t"+ name+ "\t"+ sal);
		}
		printps.close();	
	}
	void createEmp(String id, String name,String sal) throws SQLException, ClassNotFoundException
	{
		PreparedStatement createps;
		ResultSet rs;
		String createQ = "insert into empll values(?,?,?)";
		createps=con.prepareStatement(createQ);  
		createps.setString(1,id);
		createps.setString(2,name);  
		createps.setString(3,sal);
  
		int i=createps.executeUpdate();  
		System.out.println(i+" records inserted");  
		createps.close();
	}
	void updateEmp(String id, String name) throws SQLException, ClassNotFoundException
	{
		PreparedStatement updateps;
		ResultSet rs;
		String updateQ = "update empll set name = ? where id = ? ";
		updateps=con.prepareStatement(updateQ);  
		updateps.setString(1,name);
		updateps.setString(2,id);  
		
		int i=updateps.executeUpdate();  
		System.out.println(i+" records updated");  
  		updateps.close();
	}
	private static void deleteEmp(String id) throws SQLException, ClassNotFoundException
	{
		PreparedStatement deleteps;
		ResultSet rs;
		String deleteQ = "delete from empll where id=?";
		deleteps=con.prepareStatement(deleteQ);  
		deleteps.setString(1,id);
  
		int i=deleteps.executeUpdate();  
		System.out.println(i+" records deleted"); 
		deleteps.close(); 
	}
}