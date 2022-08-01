import java.applet.*;
import java.awt.*;

public class Fontstyle extends Applet
{
	Font obj = new Font("serif" , Font.BOLD, 40);
	public void paint(Graphics g)
	{
		g.setFont(obj);
		g.drawString("Welcome To GPP", 20 ,40);
	}
}

//<applet code="Fontstyle" width=400 height=400> </applet>