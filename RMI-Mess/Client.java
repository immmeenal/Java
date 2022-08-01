import java.rmi.*;
import java.rmi.registry.*;

public class Client 
{ 
public static void main(String[] args) 
{ 
try 
{ 
// Getting the registry 
Registry registry = LocateRegistry.getRegistry(5001);
// Looking up the registry for the remote object 
Hello stub = (Hello) registry.lookup("rmi://localhost/Hello");
 
// Calling the remote method using the obtained object 
stub.printmsg(); 
// System.out.println("Remote method invoked"); 
} 
catch (Exception e) 
{ 
System.err.println("Client exception: " + e.toString()); 
e.printStackTrace(); 
} 
} 
}