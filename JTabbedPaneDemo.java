import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;


/*<applet code="JTabbedPaneDemo" width=400 height=400>
</applet>*/

public class JTabbedPaneDemo extends JApplet
{
	public void init()
	{
		Container cp = getContentPane();
		//cp.setLayout(new FlowLayout());

		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("Personal Info", new PersonalPanel());
		jtp.addTab("Academic Info", new AcademicPanel());
		
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp = new JScrollPane(jtp,v,h);

		cp.add(jsp);
		
	}


}

class PersonalPanel extends JPanel implements ItemListener, ActionListener
{
	JTextField jtf6,jtf7;
	public PersonalPanel()
	{
		JLabel j1= new JLabel("Enrollment Number");
		JTextField jtf1 = new JTextField(15);
		JLabel j2=new JLabel("First Name");
		JTextField jtf2 = new JTextField(15);
		JLabel j3=new JLabel("Middle Name");
		JTextField jtf3 = new JTextField(15);
		JLabel j4=new JLabel("Last Name");
		JTextField jtf4 = new JTextField(15);
		JLabel j5=new JLabel("Email");
		JTextField jtf5 = new JTextField(15);
		JLabel j6=new JLabel("Address");
		JTextArea jta1= new JTextArea("Your Address",4,15);
		JLabel j7=new JLabel("Gender");
		add(j1);
		add(jtf1);
		add(j2);
		add(jtf2);
		add(j3);
		add(jtf3);
		add(j4);
		add(jtf4);
		add(j5);
		add(jtf5);
		add(j6);
		add(jta1);
		add(j7);
		JRadioButton f = new JRadioButton("Female");
		f.addActionListener(this);
		add(f);
		JRadioButton m = new JRadioButton("Male");
		m.addActionListener(this);
		add(m);
		JRadioButton o = new JRadioButton("Other");
		o.addActionListener(this);
		add(o);
		ButtonGroup bg = new ButtonGroup();
		bg.add(f);
		bg.add(m);
		bg.add(o);
		jtf6 = new JTextField(15);
		add(jtf6);
		JLabel j8=new JLabel("State");
		JComboBox jc =new JComboBox();
		jc.addItem("Gujrat");
		jc.addItem("Maharashtra");
		jc.addItem("Rajastan");
		jc.addItem("Uttar Pradesh");
		jc.addItemListener(this);
		add(jc);
		jtf7 = new JTextField(15);
		add(jtf7);
		
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		jtf6.setText(ae.getActionCommand());
	}
	public void itemStateChanged(ItemEvent ie)
	{
		String s = (String) ie.getItem();
		jtf7.setText(s);
	}
}

class AcademicPanel extends JPanel
{
	public AcademicPanel()
	{
		
		JLabel j1= new JLabel("Register cources: ");
		JCheckBox cb1 = new JCheckBox("Java");
		JCheckBox cb2 = new JCheckBox("Android");
		JCheckBox cb3 = new JCheckBox("Python");
		JCheckBox cb4 = new JCheckBox("Data Mining");
		JCheckBox cb5 = new JCheckBox("Computer Security");
		JCheckBox cb6 = new JCheckBox("Project");
		add(j1);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(cb5);
		add(cb6);
		JLabel j2=new JLabel("Total Credits");
		JTextField jtf1 = new JTextField(15);
		JLabel j3=new JLabel("Prev Year Marks");
		JTextField jtf2 = new JTextField(15);
		add(j2);
		add(jtf1);
		add(j3);
		add(jtf2);
		
		
	}
}