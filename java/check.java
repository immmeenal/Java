import java.applet.*;
import java.awt.*;

public class check extends Applet{
	

	public void paint(Graphics g)
	{
		String s1,s2;
	s1=getParameter("username");
	s2=getParameter("password");
		if(s1.equals("abc") && s2.equals("123")) 
		{
			g.drawString("Welcome user",50,50);
		}
		else
		{
			g.drawString("Invalid username",50,50);
		}
	}
}