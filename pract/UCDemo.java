import java.net.*;
import java.io.*;
import java.util.Date;

class UCDemo
{
	public static void main(String[] args) throws Exception
	{
		int c;
		URL hp = new URL("http://www.google.com");
		URLConnection hpcon = hp.openConnection();
		
		//get Date
		long d = hpcon.getDate();
		if(d==0)
		{
			System.out.println("No date information");
		}
		else
		{
			System.out.println("Date: "+new Date(d));
		}		
		
		//get content type
		System.out.println("Content type : " +hpcon.getContentType());
		
		//get expiration date
		d = hpcon.getExpiration();
		if(d==0)
		{
			System.out.println("No expiration date information");
		}
		else
		{
			System.out.println("Expires: "+new Date(d));
		}
		

		//get last-modified date
		d = hpcon.getLastModified();
		if(d==0)
		{
			System.out.println("No last modified date information");
		}
		else
		{
			System.out.println("Expires: "+new Date(d));
		}

		//get content length date
		int len = hpcon.getContentLength();
		if(len==0)
		{
			System.out.println("Content length unavailable");
		}
		else
		{
			System.out.println("Content length:  "+len);
		}
	}

}