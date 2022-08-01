import javax.swing.*;
import java.awt.*;

/* <applet code = "JTextFieldDemo" width=400 height=400>
</applet>
*/

public class JTextFieldDemo extends JApplet
{
	public void init()
	{
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		JTextField jt = new JTextField("TextField",15);
		add(jt);
		
	}


}