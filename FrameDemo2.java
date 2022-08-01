import java.awt.*;
import java.awt.event.*;
public class FrameDemo2
{
	Frame f;
	FrameDemo2()
	{
		f=new Frame();
		f.setSize(399,300);
		f.setTitle("Hello Frame");
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new FrameDemo2();
	}
}
