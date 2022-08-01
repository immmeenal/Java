import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.awt.event.*;

/*
<applet code = "JLabelDemo" width=500 height=500>
</applet>
*/

public class JLabelDemo extends JApplet implements ActionListener{

	JTextField jtf;
	public void init()
	{
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		ImageIcon i1= new ImageIcon("india.jpg");
		JButton jb1 = new JButton(INDIA);
		jb1.setActionCommand("INDIA");
		jb1.addActionListener(this);
		cp.add(jb1);

		Image image1 = i1.getImage(); // transform it 
		Image newimg1 = image1.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);   
		i1 = new ImageIcon(newimg1);  // transform it back

		ImageIcon i2= new ImageIcon("germany.png");
		JButton jb2 = new JButton(GERMANY);
		jb2.setActionCommand("GERMANY");
		jb2.addActionListener(this);
		cp.add(jb2);
		
		Image image2 = i2.getImage(); // transform it 
		Image newimg2 = image2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);  
		i2 = new ImageIcon(newimg2);  // transform it back

		ImageIcon i3= new ImageIcon("nepal1.png");
		JButton jb3 = new JButton(NEPAL);
		jb3.setActionCommand("NEPAL");
		jb3.addActionListener(this);
		cp.add(jb3);

		Image image3 = i3.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH); 
		i3 = new ImageIcon(newimg3);  // transform it back


		//add text field to content pane
		jtf = new JTextField(10);
		cp.add(jtf);

		//create label
		//JLabel j1= new JLabel("India",i1,JLabel.RIGHT);
		//JLabel j2= new JLabel("Germany",i2,JLabel.CENTER);
		//JLabel j3= new JLabel("Nepal",i3,JLabel.LEFT);

		//add(j1);
		//add(j2);
		//add(j3);


	}

	public void actionPerformed(ActionEvent ae){
		jtf.setText(ae.getActionCommand());
	}
}
