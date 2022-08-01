import java.sql.*;  
class UpdatePrepared
{  
	public static void main(String args[]){
	PreparedStatement ps;  
	ResultSet rs;
	String id,name,sal;
	try
	{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","7284559");  
  		
		ps=con.prepareStatement("select * from empll");
		rs = ps.executeQuery();
		System.out.println("Table before insertion");
		System.out.println("empID \t empNAME \t empSALARY");
		while(rs.next())
		{
			id=rs.getString(1);
			name=rs.getString(2);
			sal=rs.getString(3);
			System.out.println(id +"\t"+ name+ "\t"+ sal);
		}		
		ps=con.prepareStatement("update empll set name = ? where id = ? ");  
		ps.setString(1,"Suman");
		ps.setString(2,"e103");  
		
  
		int i=ps.executeUpdate();  
		System.out.println(i+" records updated");  
  
		
		ps=con.prepareStatement("select * from empll");
		rs = ps.executeQuery();
		while(rs.next())
		{
			id=rs.getString(1);
			name=rs.getString(2);
			sal=rs.getString(3);
			System.out.println(id +"\t"+ name+ "\t"+ sal);
		}
		con.close();  
  
	}catch(Exception e)
	{
		 System.out.println(e);
	}  
  
	}  
}  