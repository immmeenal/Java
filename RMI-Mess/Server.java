import java.rmi.*;
import java.rmi.registry.*;


{ 
public static void main(String args[])  
{ 

{ 





registry.rebind("rmi://localhost/Hello", stub); 

System.err.println("Server ready"); 
} 

{ 
System.out.println("Server exception: " + e.toString());
e.printStackTrace(); 
}
} 
} 