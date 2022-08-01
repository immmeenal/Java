import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="ButtonDemo" width=400 height=500>
</applet>*/

public class ButtonDemo extends Applet implements ActionListener
{

		String msg = "";
		Button yes,no,maybe;

	public void init()
	{

		yes = new Button("YES");
		no = new Button("NO");
		maybe = new Button("UNDECIDED");

		add(yes);
		add(no);
		add(maybe);

		yes.addActionListener(this);
		no.addActionListener(this);
		maybe.addActionListener(this);

	}//end of init

	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		if(str == "YES")
		{
			msg= "You Clicked on "+str;
		}
		else if(str == "NO")
		{
			msg= "You Clicked on "+str;
		}
		else
		{
			msg= "You Clicked on " + str;
		}
		
		repaint();

	}//end of actionPerformed
	
	public void paint(Graphics g)
	{
		g.drawString(msg, 50,50);
	}//end of paint

}//end of ButtoDemo