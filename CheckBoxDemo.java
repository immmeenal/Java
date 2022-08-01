import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code=CheckBoxDemo width=400 height=500>
</applet>
*/

public class CheckBoxDemo extends Applet implements ItemListener
{
	String msg="";
	Checkbox chk1,chk2,chk3;
	public void init()
	{
		chk1 = new Checkbox("MATHS");
		chk2= new Checkbox("PHYSICS");
		chk3= new Checkbox("BIO");

		add(chk1);
		add(chk2);
		add(chk3);

		chk1.addItemListener(this);
		chk2.addItemListener(this);
		chk3.addItemListener(this);
	
	}
              public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg = "Current State";
		g.drawString(msg, 50,50);
		msg="Maths: "+chk1.getState();
		g.drawString(msg, 50,60);
		msg="Physics: "+chk2.getState();
		g.drawString(msg, 50,80);
		msg="Bio: "+chk3.getState();
		g.drawString(msg, 50,110);
	}
}