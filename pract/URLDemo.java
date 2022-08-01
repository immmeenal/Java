import java.util.*;
import java.net.URL;
import java.net.MalformedURLException;

class URLDemo
{
	public static void main(String[] args) throws MalformedURLException
	{
		URL url = new URL("http://www.google.com");

		System.out.println("Protolcol : "+url.getProtocol());
		System.out.println("Port : "+url.getPort());
		System.out.println("Host : "+url.getHost());
		System.out.println("File : "+url.getFile());
		System.out.println("Ext : "+url.toExternalForm());
	}

}