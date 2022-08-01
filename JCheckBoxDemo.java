import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//<applet code= "JCheckBoxDemo" width=400 height=400></applet>

public class JCheckBoxDemo extends JApplet implements ItemListener
{
	JTextField jtx;	
	public void init()
	{
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		JCheckBox ck = new JCheckBox("Python");
		ck.addItemListener(this);
		cp.add(ck);

		JCheckBox ck1 = new JCheckBox("Java");
		ck1.addItemListener(this);
		cp.add(ck1);

		JCheckBox ck2 = new JCheckBox("Android");
		ck2.addItemListener(this);
		cp.add(ck2);
		
		jtx = new JTextField(15);
		cp.add(jtx);

	}
	public void itemStateChanged(ItemEvent ie)
	{
		JCheckBox cb = (JCheckBox) ie.getItem();
		jtx.setText(cb.getText());
	}

}