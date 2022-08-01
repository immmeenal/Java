import java.sql.*;
import java.util.Scanner;

public class CollablePro
{
	static Connection con;
	static ResultSet rs;
	static String id,name,salary;
	static String query1 ="{call EMPprocedure()}"; 
	static String query2 = "{call empinsert(?,?,?)}";
	static String query3 = "{call empupdate(?,?)}";
	static String query4 = "{call empdelete(?)}";
	static String query5 = "{call emppOUT(?)}";
	static String query6 = "{call emppINOUT(?,?)}";

	public static void main(String agrs[]) throws Exception
	{
	Scanner sc = new Scanner(System.in);
 
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3300/emp", "root", "7284559");
	
	System.out.println("1.select\n2.insert\n3.update\n4.delete\n5.OUT Procedure\n6.INOUT Procedure\nEnter your choice: ");
	int ch = sc.nextInt();
	switch(ch){
	case 1:
	//select procedure
	CallableStatement csst = con.prepareCall(query1);
	System.out.println("Employee table");
	csst.execute();
	rs = csst.getResultSet();
	System.out.println("ID\tNAME\tSALARY");
	while (rs.next()) {
	String id = rs.getString(1);
	String name = rs.getString(2);
	String salary = rs.getString(3);
	System.out.println(id + "\t" + name + "\t" + salary);
	}
	System.out.println("\n");
	break;
	case 2:
	//insert procedure
	csst = con.prepareCall(query2);
	System.out.println("Enter Employee id");
	id = sc.next();
	csst.setString(1,id);
	System.out.println("Enter Employee name");
	name = sc.next();
	csst.setString(2,name);
	System.out.println("Enter Employee salary");
	salary = sc.next();
	csst.setString(3,salary);
	csst.execute();
	
	System.out.println("\n");
	break;
	case 3:
	//update procedure
	csst = con.prepareCall(query3);
	System.out.println("Enter Employee id");
	id = sc.next();
	csst.setString(1,id);
	System.out.println("Enter Employee salary");
	salary = sc.next();
	csst.setString(2,salary);
	csst.execute();
	
	break;
	case 4:
	//delete procedure
	csst = con.prepareCall(query4);
	System.out.println("Enter Employee id");
	id = sc.next();
	csst.setString(1,id);
	csst.execute();
	
	break;
	case 5:
	//out procedure
	csst = con.prepareCall(query5);
	csst.registerOutParameter(1,Types.INTEGER);
	System.out.println("Executing Out procedure");
	csst.execute();
	System.out.println("Total count of employess in company whos SALARY > 80000 :  " + csst.getInt(1));
	System.out.println("\n");
	break;
	case 6:
	//INOUT procedure
	csst = con.prepareCall(query6);
	System.out.println("Enter Employee salary");
	salary = sc.next();
	csst.setString(2,salary);
	csst.registerOutParameter(1,Types.INTEGER);
	System.out.println("Executing INOUT procedure");
	csst.execute();
	System.out.println("Count of Employee "+csst.getInt(1)+" whos salary is greater than:  " + salary);
	System.out.println("\n");
	break;
	default:
	System.out.println("Enter valid option");
	}


}
}