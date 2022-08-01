import javax.swing.*;
import java.awt.*;

/* <applet code= "JTabbedPaneDemo1" width=400 height=400>
</applet>*/

public class JTabbedPaneDemo1 extends JApplet
{
	
	public void init()
	{
		Container cp = getContentPane();
		JTabbedPane tp = new JTabbedPane();
		tp.addTab("Personal Info", new PersonalPane());
		tp.addTab("Academic",new AcademicPane());
		cp.add(tp);
		
	}

}
class PersonalPane extends JPanel
{
	public PersonalPane()
	{
		JButton b1 = new JButton("First");
		add(b1);
		JButton b2 = new JButton("Second");
		add(b2);
		JButton b3 = new JButton("Third");
		add(b3);
		JButton b4 = new JButton("Fourth");
		add(b4);

	}

}
class AcademicPane extends JPanel
{
	public AcademicPane()
	{
		JCheckBox j1 = new JCheckBox("First");
		add(j1);
		JCheckBox j2 = new JCheckBox("Second");
		add(j2);
		JCheckBox j3 = new JCheckBox("Third");
		add(j3);
	}

}