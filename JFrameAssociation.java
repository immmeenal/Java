import javax.swing.*;

class JFrameAssociation
{
JFrame f;
JButton b;
JFrameAssociation()
{
	f= new JFrame();
	b = new JButton("Click");
	b.setBounds(120,100,100,40);
	f.add(b);
	f.setSize(300,300);
	f.setLayout(null);
	f.setVisible(true);

}

	public static void main(String[] args)
	{
		
		new JFrameAssociation();
	}

}