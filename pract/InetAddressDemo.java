import java.net.*;

class InetAddressDemo 
{
	public static void main(String[] args) throws UnknownHostException
	{
	int i;
	InetAddress Addr = InetAddress.getLocalHost();
	System.out.println(Addr);
	InetAddress Address = InetAddress.getByName("google.com");
	System.out.println(Address);
	InetAddress Sw[] = InetAddress.getAllByName("www.nba.com");
	for(i=0;i<Sw.length;i++)
	{
		System.out.println(Sw[i]);
	}
	System.out.println("Host Name : " +Address.getHostName());
	System.out.println("IP Address : " +Address.getHostAddress());
	System.out.println("Is ip1 == ip2 : " +Addr.equals(Address));
	System.out.println("Is Multicast address : " +Addr.isMulticastAddress());
	System.out.println("Is site local address : " +Addr.isSiteLocalAddress());
	}
	
}
