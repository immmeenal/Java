import javax.swing.*;
import java.awt.*;

// <applet code= "JTableDemo1" width=400 height=400></applet>

public class JTableDemo1 extends JApplet 
{
	
	public void init()
	{
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		final String[] colHeads = {"Enroll no","Name","Marks"};
		
		final Object[][] data ={
				{"1907017","Minal","800"},
				{"1907017","Minal","800"},
				{"1907017","Minal","800"},
				{"1907017","Minal","800"},
				{"1907017","Minal","800"},
				{"1907017","Minal","800"},
				{"1907017","Minal","800"},
				{"1907017","Minal","800"},
				{"1907017","Minal","800"},
				{"1907017","Minal","800"},
				{"1907017","Minal","800"},
				{"1907017","Minal","800"},
				{"1907017","Minal","800"},
				{"1907017","Minal","800"}
			};	
		
		JTable table = new JTable(data,colHeads);

		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp = new JScrollPane(table,v,h);

		cp.add(jsp,BorderLayout.CENTER);
	}

}