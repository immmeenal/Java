//import java.rmi.registry.LocateRegistry; 
//import java.rmi.registry.Registry;  
import java.rmi.*;
import java.rmi.registry.*;

public class Client 
{  
  
   public static void main(String[] args) 
   {  
      try 
      {  
         // Getting the registry 
         
    
         // Looking up the registry for the remote object 
         
    
         // Calling the remote method using the obtained object 
         stub.printMsg(); 
         
         // System.out.println("Remote method invoked"); 
      } 
      catch (Exception e) 
      {
         System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}