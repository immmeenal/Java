import java.rmi.*;

{
	public static void main(String args[]) 
	{
		try
		{
			AddServerInterface st = (AddServerInterface)Naming.lookup("rmi://"+args[0]+"/AddService");

		}
		catch(Exception e) 
		{

		}
	}
