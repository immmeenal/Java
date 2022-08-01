import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<Applet code="LoginForm" width=400 height=400>
</Applet> */

public class LoginForm extends Applet implements ActionListener{

	Label lblUserName, lblPassWord;
	Button btnSubmit, btnReset;
	String msg,msg1,str;
	TextField txtUser,txtPass;

	public void init()
	{
		Label Title = new Label("LOGIN FORM");
		lblUserName = new Label("Username");
		lblPassWord = new Label("Password");
		
		txtUser = new TextField(10);
		txtPass = new TextField(10);
		txtPass.setEchoChar('*');

		btnSubmit = new Button("Submit");
		btnReset = new Button("Reset");
		
		add(Title);
		add(lblUserName);
		add(txtUser);
		add(lblPassWord);
		add(txtPass);
		
		add(btnSubmit);
		add(btnReset);

		btnSubmit.addActionListener(this);
		btnReset.addActionListener(this);

	}//end of init
	
	public void actionPerformed(ActionEvent AE)
	{
		
		str = AE.getActionCommand();
		
		if(str=="Submit")
		{
		msg = txtUser.getText();
		msg1 = txtPass.getText();
		//msg="You clicked on "+str +" ";
		}
		if(str=="Reset"){
		txtUser.setText("");
		txtPass.setText("");
		}
		repaint();
	}

	public void paint(Graphics g){
		
		
		g.drawString("Welcome " + msg, 300 , 220);
		g.drawString("Your Password is " + msg1, 300 , 420);
		
	}
		
}