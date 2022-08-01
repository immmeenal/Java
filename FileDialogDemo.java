import java.awt.*;
import java.awt.event.*;

public class FileDialogDemo implements ActionListener{
	FileDialog fd;
	FileDialogDemo(){
	Frame f = new Frame();
	fd = new FileDialog(f,"OPEN",FileDialog.LOAD);
	Button b = new Button("OPEN");
	b.addActionListener(this);
	f.add(b);
	f.setSize(200,200);
	f.setVisible(true);
}
public void actionPerformed(ActionEvent e){
	fd.setVisible(true);
}
public static void main(String[] args){
	new FileDialogDemo();
}
}

	