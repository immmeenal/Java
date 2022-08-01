import java.rmi.*;
import java.rmi.registry.*;

public class AddServer{
	public static void main(String args[]) throws Exception{
		
			AddServerInterface addService = new Adder();
			//Registry registry = LocateRegistry.createRegistry(5000);
			//registry.rebind("rmi://localhost/Addservice",addService);
			Naming.rebind("rmi://localhost/Addservice",addService);
		
	}
}
