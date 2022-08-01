import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//<applet code= "JComboBoxDemo" width=400 height=400></applet>

public class JComboBoxDemo extends JApplet implements ItemListener
{
	JTextField jtx;
	public void init()
	{
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		JComboBox cb = new JComboBox();
		cb.addItem("Python");
		cb.addItem("Java");
		cb.addItem("Android");
		cb.addItem("Data Mining");
		cb.addItem("Project");
		cb.addItem("Computer Security");
		cp.add(cb);
		cb.addItemListener(this);
		
		jtx = new JTextField(10);
		cp.add(jtx);
		
	}
	public void itemStateChanged(ItemEvent ie)
	{
		String str = (String) ie.getItem();
		jtx.setText(str);
	}

}