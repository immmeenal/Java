import java.awt.*;
import javax.swing.*;

public class JFramePane
{
	public static void main(String[] args)
	{
		JFrame f = new JFrame("This is Frame");
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		JButton b = new JButton("Button");
		JLabel l = new JLabel("This is Label");
		p.add(l);
		p.add(b);
		f.add(p);
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}