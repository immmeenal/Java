import java.awt.*;
import java.awt.event.*;
public class FrameDemo
{
	Frame f;
	FrameDemo()
	{
		f=new Frame("Frame Example");
		f.setSize(300,300);
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new FrameDemo();
	}
}
