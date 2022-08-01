import java.rmi.*;
import java.rmi.registry.*;

public class Server{

	public static void main(String[] args) throws Exception
	{
		Addi st = new Addc();

		Naming.rebind("rmi://localhost/addservice",st);
	}
} 