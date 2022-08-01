import java.awt.*;
import javax.swing.*;

/* <applet code = "JTableDemo" width= 400 height = 400>
</applet>*/

public class JTableDemo extends JApplet
{
	public void init()
	{
		//Get content pane
		Container contentPane = getContentPane();

		//set layout manager
		contentPane.setLayout(new BorderLayout());

		//Initialize col headings
		final String[] colHeads = {"Enrollment No.","Name","Contact no."};

		//Initialize data
		final Object[][] data={
			{"1906001","Pradnya Aher","4568345888"},
			{"1906002","Saurabh Asnare","2448345888"},
			{"1906003","Aishwarya Avti","9876345888"},
			{"1906004","Ajay Awchar","7896345888"},
			{"1906005","Mrunal Babar","8798345888"},
			{"1906006","Samruddhi Bagul","9688345888"},
			{"1906007","Pritam Dahiphale","7808345888"},
			{"1906008","Minal Chhatre","9008345888"},
			{"1906009","Radhika Shaski","9888345888"},
			{"1906010","Ishawari Chitare","9998345888"}
		};
		//create the table
		JTable table = new JTable(data, colHeads);
		
		//add table to scrollpane
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp = new JScrollPane(table, v,h);

		//add scroll pane to the content pane
		contentPane.add(jsp,BorderLayout.CENTER);

	}
}