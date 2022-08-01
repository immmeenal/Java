import java.rmi.*;
import java.rmi.registry.*;
public class AddServer
{
	public static void main(String args[])
	{
		try
		{
			AddServerInterface addService=new Adder();
			Naming.rebind("AddService",addService);
			//addService object is hosted with name AddService
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}