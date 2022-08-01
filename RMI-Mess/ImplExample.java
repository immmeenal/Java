import java.rmi.*;
import java.rmi.server.*;

public class ImplExample extends UnicastRemoteObject implements Hello 
{

	ImplExample() throws RemoteException { super(); }

	//Implementing the interface method
	public void printmsg() throws RemoteException
	{
		System.out.println("This is an example of RMI program");	
	}
}