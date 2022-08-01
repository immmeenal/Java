import java.rmi.*;
import java.rmi.server.*;

// Implementing the remote interface 
public class ImplExample extends UnicastRemoteObject implements Hello 
{  
   	ImplExample() throws RemoteException 
	{ 
		super();
	}


	public void printMsg()
	{  
		System.out.println("This is an example RMI program");  
	}  
} 