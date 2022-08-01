import java.rmi.*;
import java.rmi.registry.*;

public class Server 
{ 
public static void main(String args[])  
{ 
try 
{ 

Hello stub = (Hello) new ImplExample(); 

Registry registry = LocateRegistry.createRegistry(5001); 

registry.rebind("rmi://localhost/Hello", stub); 

System.err.println("Server ready"); 
} 
catch (Exception e) 
{ 
System.out.println("Server exception: " + e.toString());
e.printStackTrace(); 
} 
} 
} 