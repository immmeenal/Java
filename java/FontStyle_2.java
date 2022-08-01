import java.awt.*;
import java.applet.*;

/* <applet code="FontStyle_2" width=500 height= 600 >
</applet> */

public class FontStyle_2 extends Applet 
{
	Font obj1 = new Font("serif", Font.ITALIC, 40);
	Font obj2 = new Font("Times New Roman", Font.BOLD, 30);

	public void paint(Graphics g)
	{
		g.setFont(obj1);
		g.drawString("Welcome to GPP",40,60);
		g.setFont(obj2);
		g.drawString("Hello",80,160);
		
	}

}