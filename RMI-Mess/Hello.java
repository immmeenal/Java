import java.rmi.Remote;
import java.rmi.RemoteException;
//Creating remote interface for our applicaton
public interface Hello extends Remote
{
	void printmsg() throws RemoteException;
}