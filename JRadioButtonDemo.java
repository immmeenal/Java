import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//<applet code = "JRadioButtonDemo" width=400 height=400></applet>

public class JRadioButtonDemo extends JApplet implements ActionListener
{
	JTextField jtx;
	public void init()
	{
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
	
		JRadioButton jr = new JRadioButton("Python");
		jr.addActionListener(this);
		cp.add(jr);

		JRadioButton jr1 = new JRadioButton("Java");
		jr1.addActionListener(this);
		cp.add(jr1);

		JRadioButton jr2 = new JRadioButton("Android");
		jr2.addActionListener(this);
		cp.add(jr2);

		ButtonGroup bg = new ButtonGroup();
		bg.add(jr);
		bg.add(jr1);
		bg.add(jr2);

		jtx = new JTextField(10);
		cp.add(jtx);
	}
	public void actionPerformed(ActionEvent ae)
	{
		jtx.setText(ae.getActionCommand());
	}	
	

}