import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

/*
<applet code = "JTreeDemo1" width=400 height=400>
</applet>
*/

public class JTreeDemo1 extends JApplet
{
	public void init()
	{
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());

		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Computer Division");
		
		DefaultMutableTreeNode first = new DefaultMutableTreeNode("First Year");
		top.add(first);
		DefaultMutableTreeNode G1 = new DefaultMutableTreeNode("G1");
		first.add(G1);
		DefaultMutableTreeNode H1 = new DefaultMutableTreeNode("H1");
		first.add(H1);
		DefaultMutableTreeNode N1 = new DefaultMutableTreeNode("N1");
		first.add(N1);


		DefaultMutableTreeNode second = new DefaultMutableTreeNode("Second Year");
		top.add(second);
		DefaultMutableTreeNode G2 = new DefaultMutableTreeNode("G2");
		second.add(G2);
		DefaultMutableTreeNode H2 = new DefaultMutableTreeNode("H2");
		second.add(H2);
		DefaultMutableTreeNode N2 = new DefaultMutableTreeNode("N2");
		second.add(N2);


		DefaultMutableTreeNode third = new DefaultMutableTreeNode("Third Year");
		top.add(third);
		DefaultMutableTreeNode G3 = new DefaultMutableTreeNode("G3");
		third.add(G3);
		DefaultMutableTreeNode H3 = new DefaultMutableTreeNode("H3");
		third.add(H3);
		DefaultMutableTreeNode N3 = new DefaultMutableTreeNode("N3");
		third.add(N3);

		JTree tree = new JTree(top);

		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp = new JScrollPane(tree,v,h);

		cp.add(jsp,BorderLayout.CENTER);
		
	}

}