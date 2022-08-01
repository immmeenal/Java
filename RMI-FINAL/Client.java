import java.rmi.*;
import java.rmi.registry.*;

public class Client{

	public static void main(String[] args) throws Exception
	{
		Addi st = (Addi ) Naming.lookup("rmi://localhost/addservice");
		System.out.println(st.sum(2,2));
}
}