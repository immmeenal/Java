import java.awt.*;
import java.awt.event.*;

public class DialogDemo implements ActionListener
{
	Dialog d;
	DialogDemo()			
	{
		Frame f = new Frame();
		d = new Dialog(f,"Dialog Example",true);
		d.setLayout(new FlowLayout());
		Button b = new Button("OK");
		b.addActionListener(this);
		d.add(new Label("click on button to continue"));
		d.add(b);
		d.setSize(300,300);
		d.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		d.setVisible(false);
	}
	public static void main(String[] args)
	{
		new DialogDemo();
	}
}