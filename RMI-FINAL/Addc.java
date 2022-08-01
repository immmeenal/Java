import java.rmi.*;
import java.rmi.server.*;

public class Addc extends UnicastRemoteObject implements Addi{
	
	Addc() throws RemoteException
	{
		super();
	}
	public int sum(int a, int b)
	{
		return a+b;
	}

}