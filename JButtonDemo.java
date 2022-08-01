import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/* <applet code= "JButtonDemo" width=400 height=400>
</applet>*/

public class JButtonDemo extends JApplet implements ActionListener
{
	JTextField jtx;
	public void init()
	{
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		ImageIcon ii = new ImageIcon("germany.png");
		JButton btn1 = new JButton(ii);
		btn1.setActionCommand("First");
		btn1.addActionListener(this);
		cp.add(btn1);

		ImageIcon ii2 = new ImageIcon("germany.png");
		JButton btn2 = new JButton(ii2);
		btn2.setActionCommand("Second");
		btn2.addActionListener(this);
		cp.add(btn2);
		
		jtx = new JTextField(10);
		cp.add(jtx);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		jtx.setText(ae.getActionCommand());

	}

}