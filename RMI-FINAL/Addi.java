import java.rmi.*;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Addi extends Remote
{
	public int sum(int a,int b) throws RemoteException;
	


}
