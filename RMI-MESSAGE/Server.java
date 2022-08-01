//import java.rmi.registry.Registry; 
//import java.rmi.registry.LocateRegistry; 
//import java.rmi.RemoteException; 
//import java.rmi.server.UnicastRemoteObject; 
import java.rmi.*;
import java.rmi.registry.*;

public class Server
{ 
   
   public static void main(String args[]) { 
      try 
      { 
         
         Hello stub = (Hello) new ImplExample();  
         
         // Binding the remote object (stub) in the registry 
         Registry registry = LocateRegistry.createRegistry(5001); 
         
         registry.rebind("rmi://localhost/Hello", stub);  
         System.err.println("Server ready"); 
       } 
       catch (Exception e)
       { 
         System.err.println("Server exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
} 