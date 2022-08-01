import java.rmi.*;
import java.rmi.registry.*;

public class Client{
	public static void main(String args[]) throws Exception{
	
			// Registry registry = LocateRegistry.getRegistry(5000);
			// AddServerInterface st = (AddServerInterface) registry.lookup("rmi://localhost/Addservice");
			AddServerInterface st = (AddServerInterface) Naming.lookup("rmi://localhost/Addservice");		
			System.out.println(st.sum(16,25));
			st.mes("hello");
		
	}
}
