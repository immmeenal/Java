import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code ="Flowdemo" width=500 height=500>
</applet>
*/

public class Flowdemo extends Applet implements ItemListener
{

	String msg="";
	Checkbox chk1,chk2,chk3;

	public void init()
	{

		setLayout(new FlowLayout(FlowLayout.CENTER));		

		chk1 = new Checkbox("Maths");
		chk2 = new Checkbox("Physics");
		chk3 = new Checkbox("Chemistry");

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
		msg = "States: ";
		g.drawString(msg,30,50);
		msg = "Maths: "+chk1.getState();
		g.drawString(msg,30,70);
		msg = "Physics: "+chk2.getState();
		g.drawString(msg,30,90);
		msg = "Chemistry: "+chk3.getState();
		g.drawString(msg,30,110);
	}

}