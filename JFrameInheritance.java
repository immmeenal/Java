import javax.swing.*;

class JFrameInheritance extends JFrame
{
JFrame f;

JFrameInheritance()
{
	JButton b = new JButton("Click");
	b.setBounds(120,100,100,40);
	add(b);
	setSize(300,300);
	setLayout(null);
	setVisible(true);
}
public static void main(String[] args)
{
new JFrameInheritance();
}
}