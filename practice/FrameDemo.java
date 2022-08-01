import java.awt.*;

class FrameDemo
{
	Frame f;
	FrameDemo()
	{
		f = new Frame();
		f.setTitle("Frame Window");
		f.setSize(400,400);
		f.setVisible(true);

	}
	public static void main(String[] args)
	{
		new FrameDemo();
	}


}