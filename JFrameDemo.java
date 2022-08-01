import javax.swing.*;

class JFrameDemo
{
	public static void main(String[] args){
	JFrame j = new JFrame();
	JButton b = new JButton("Click");
	b.setBounds(120,100,100,40);
	
	j.add(b);
	j.setSize(300,300);
	j.setLayout(null);
	j.setVisible(true);
}
}