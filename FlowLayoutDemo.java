import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code=FlowLayoutDemo width=400 height=500>
</applet>*/

public class FlowLayoutDemo extends Applet implements ItemListener
{
	
	String msg= "";
	Checkbox chkmath, chkphy, chkbio;
	CheckboxGroup cbg;

	public void init()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT));
		cbg = new CheckboxGroup();
		chkmath= new Checkbox("Maths", cbg, true);
		chkphy= new Checkbox("Physics", cbg, false);
		chkbio= new Checkbox("Biology", cbg, false);

		add(chkmath);
		add(chkphy);
		add(chkbio);

		chkmath.addItemListener(this);
		chkphy.addItemListener(this);
		chkbio.addItemListener(this);

	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}

	public void paint(Graphics g)
	{
		msg="Current Selection: ";
		msg += cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg,50,50);
	}
}