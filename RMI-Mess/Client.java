import java.rmi.*;
import java.rmi.registry.*;

public class Client 
{ 


try 

// Getting the registry 



 
// Calling the remote method using the obtained object 
stub.printmsg();
// System.out.println("Remote method invoked"); 
} 
catch (Exception e) 
{ 

e.printStackTrace(); 
}
} 
}