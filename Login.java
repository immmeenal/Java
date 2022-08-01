import java.awt.*;
import java.awt.event.*;
import java.applet.*;


/* <applet code = "Login" width = 400 height=400>
</applet>
*/

public class Login extends Applet implements ActionListener
{
	Button log;
	TextField tuser,tpass;
	Label str,user,pass;
	public void init()
	{
		user = new Label("UserName");
		pass = new Label("Password");
		log = new Button("Login");
	
		tuser= new TextField(10);
		tpass= new TextField(10);
		tpass.setEchoChar('*');
		str = new Label();
		add(user);
		add(tuser);
		add(pass);
		add(tpass);
		add(log);
		add(str);

		log.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ae)
	{
		String str1,str2;

		str1 = tuser.getText();
		str2 = tpass.getText();
		
		if((str1.equals("abc"))&&(str2.equals("123")))
		{
			str.setText("Succeful");
		}
		else{
			str.setText("Wrong");
		}

	}

}