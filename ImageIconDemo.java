import javax.swing.*;
import java.awt.*;

/*<applet code = "ImageIconDemo" width= 400 height=400></applet>
*/

public class ImageIconDemo extends JApplet
{
	public void init()
	{
		Container cp = getContentPane();
		ImageIcon ii = new ImageIcon("germany.png");
		JLabel l = new JLabel("Germany",ii,JLabel.CENTER);
		cp.add(l);

	}


}