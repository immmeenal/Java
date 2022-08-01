import java.awt.*;
import java.applet.*;
import java.awt.event.*;

import javax.swing.plaf.basic.BasicListUI;

// <applet code = ButtonList width=400 height=500>
// </applet>

public class ButtonList extends Applet implements ActionListener {
	String msg = "";

	Button blist[] = new Button[3];

	public void init() {
		Button yes = new Button("Yes");
		Button no = new Button("No");
		Button maybe = new Button("maybe");

		blist[0] = (Button) add(yes);
		blist[1] = (Button) add(no);
		blist[2] = (Button) add(maybe);

		for (int i = 0; i < 3; i++) {
			blist[i].addActionListener(this);
		}
	}// end of init

	public void actionPerformed(ActionEvent ae) {
		for (int i = 0; i < 3; i++) {
			if (ae.getSource() == blist[i]) {
				msg = "You pressed " + blist[i].getLabel();
			}
		} // end of for

		repaint();

	}// end of actionPerformed

	public void paint(Graphics g) {
		g.drawString(msg, 50, 50);
	}// end of paint
}// end of ButtonList