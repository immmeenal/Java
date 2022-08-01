import java.applet.*;
import java.awt.*;

public class Fontstyle1 extends Applet
{
	Font obj = new Font("serif" , Font.BOLD, 40);
	Font obj1 = new Font("Times New Roman" , Font.ITALIC, 40);
	public void paint(Graphics g)
	{
		g.setFont(obj);
		g.drawString("Welcome To GPP", 20 ,40);
		g.setFont(obj1);
		g.drawString("My name is Minal", 20 ,300);
	}
}

//<applet code="Fontstyle1" width=400 height=400> </applet>