import java.rmi.*;

public class Adder extends UnicastRemoteObject implements AddServerInterface

	Adder()throws RemoteException
	{
		super();
	
	public int sum(int a,int b)
	
		return a+b;
	
}