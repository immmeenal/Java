import java.sql.*;  
public class CallProc {  
public static void main(String[] args) throws SQLException, ClassNotFoundException{  
  String insertQ = "{call insert(?,?,?)}";
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","7284559");  
  
CallableStatement cast=con.prepareCall(insertQ);  
cast.setString(1,"e101");  
cast.setString(2,"ISHA");  
cast.setString(3,"60000");  
cast.execute();  
  
System.out.println("success");  
}  
}  