import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="CardLayoutDemo" width=300 height=300>
</applet>
*/

public class CardLayoutDemo extends Applet implements ActionListener,MouseListener
{
Checkbox winxp,winvista,solaris,mac;
Panel osCards;
CardLayout cardlo;
Button win,other;
	public void init()
	{
		win = new Button("Windows");
		other = new Button("Other");
		add(win);
		add(other);

		cardlo = new CardLayout();
		osCards = new Panel();
		osCards.setLayout(cardlo);

		winxp = new Checkbox("Windows XP", null, true);
		winvista = new Checkbox("Windows Vista");
		solaris = new Checkbox("Solaris");
		mac = new Checkbox("MAC OS");

		//add windows os checkboxes to a panel
		Panel winpan = new Panel();
		winpan.add(winxp);
		winpan.add(winvista);
		
		//add other os checkboxes to a panel
		Panel otherpan = new Panel();
		otherpan.add(solaris);
		otherpan.add(mac);

		//add panel to card deck panel
		osCards.add(winpan,"Windos");
		osCards.add(otherpan,"Other");

		//add cards to the main applet panel
		add(osCards);

		//register to receive action events
		win.addActionListener(this);
		other.addActionListener(this);

		//register mouse event
		addMouseListener(this);
	}
	//cycle through panel
	public void mousePressed(MouseEvent me)
	{
		cardlo.next(osCards);
	}
	//provide empty implementation for other mouseListener methods
	public void mouseClicked(MouseEvent me)
	{
		
	}
	public void mouseEntered(MouseEvent me)
	{
		cardlo.next(osCards);
	}
	public void mouseExited(MouseEvent me)
	{
		cardlo.next(osCards);
	}
	public void mouseReleased(MouseEvent me)
	{
		cardlo.next(osCards);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==win)
		{
			cardlo.show(osCards,"Windows");
		}
		else
		{
			cardlo.show(osCards,"Other");
		}
	}
}