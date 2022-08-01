//MyClient.java

import java.io.*;
import java.net.*;

class MyClient
{
public static void main(String[] args) throws Exception
{
	Socket s = new Socket("LocalHost",3333);
	
	DataInputStream din = new DataInputStream(s.getInputStream());
	DataOutputStream dout = new DataOutputStream(s.getOutputStream());
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	String str1="",str2="";

	while(!str1.equals("stop"))
	{
		str1 = br.readLine();
		dout.writeUTF(str1);
		dout.flush();

		str2 = din.readUTF();
		System.out.println("Server says: "+str2);
	}
	dout.close();
	s.close();
	

}
}