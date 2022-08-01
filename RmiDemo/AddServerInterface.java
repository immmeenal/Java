import java.rmi.*;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddServerInterface extends Remote {
	public int sum(int a,int b)throws RemoteException;
	public void mes(String s) throws RemoteException;
}

