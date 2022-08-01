import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;

/*
<applet code="AppletFrame" width = 400 height=400>
</applet>
*/

//create subclass of frame 
class SubclassFrame extends Frame
{
	SubclassFrame(String title)
	{
		super(title);
		//create an object to handle window event
		MyWindowAdapter adapter = new MyWindowAdapter(this);
		//register to receive those events
		addWindowListener(adapter);
		
		

	
	}
	public void paint(Graphics g)
	{
		g.drawString("This is in frame window", 10,40);
	}

} 

//for window closing
class MyWindowAdapter extends WindowAdapter
{
	SubclassFrame sf;
	public MyWindowAdapter(SubclassFrame sf)
	{
		this.sf = sf;
	}
	public void windowClosing(WindowEvent we)
	{
		//sf.setVisible(false);
		//System.exit(0);
		sf.dispose();

	}

}

//appletframe

public class AppletFrame extends Applet
{
	Frame f;
	public void init()
	{
		f = new SubclassFrame("A Frame Window");
		f.setSize(250,250);
		f.setVisible(true);
	}
	public void start()
	{
		f.setVisible(true);
	}
	public void stop()
	{
		f.setVisible(false);
	}
	public void paint(Graphics g)
	{
		g.drawString("This is in applet window", 10,20);
	}
	

}