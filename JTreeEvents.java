import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

/* <applet code= "JTreeEvents" width=400 height=400>
</applet> */

public class JTreeEvents extends JApplet 
{
	JTree tree;
	JTextField jtf;

	public void init()
	{
		//get content pane
		Container contentPane = getContentPane();
		
		//set layout manager
		contentPane.setLayout(new BorderLayout());

		//create top node of a tree
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Computer Divisions");

		//create subtree of First year
		DefaultMutableTreeNode first = new DefaultMutableTreeNode("First Year");
		top.add(first);
		DefaultMutableTreeNode G1 = new DefaultMutableTreeNode("G1");
		first.add(G1);
		DefaultMutableTreeNode H1 = new DefaultMutableTreeNode("H1");
		first.add(H1);
		DefaultMutableTreeNode N1 = new DefaultMutableTreeNode("N1");
		first.add(N1);

		//create subtree of Second year
		DefaultMutableTreeNode second = new DefaultMutableTreeNode("Second Year");
		top.add(second);
		DefaultMutableTreeNode G2 = new DefaultMutableTreeNode("G2");
		second.add(G2);
		DefaultMutableTreeNode H2 = new DefaultMutableTreeNode("H2");
		second.add(H2);
		DefaultMutableTreeNode N2 = new DefaultMutableTreeNode("N2");
		second.add(N2);

		//create subtree of Third year
		DefaultMutableTreeNode third = new DefaultMutableTreeNode("Third Year");
		top.add(third);
		DefaultMutableTreeNode G3 = new DefaultMutableTreeNode("G3");
		third.add(G3);
		DefaultMutableTreeNode H3 = new DefaultMutableTreeNode("H3");
		third.add(H3);
		DefaultMutableTreeNode N3 = new DefaultMutableTreeNode("N3");
		third.add(N3);
		//create tree
		tree = new JTree(top);

		//add tree to scroll pane
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp = new JScrollPane(tree, v, h);

		//add scroll pane to content pane
		contentPane.add(jsp,BorderLayout.CENTER);
		
		/*//add text field to applet
		jtf = new JTextField("",20);
		contentPane.add(jtf,BorderLayout.SOUTH);*/
		
	}

}