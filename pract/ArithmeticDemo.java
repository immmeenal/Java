import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="ArithmeticDemo" width=400 height=500>
</applet>*/

public class ArithmeticDemo extends Applet implements ActionListener
{
	Label lblno1,lblno2,lblres;
	TextField txtno1,txtno2,txtadd,txtsub,txtmul,txtdiv;
	Button btnadd,btnsub,btnmul,btndiv,btnreset;
	String msg1,strsum,strsub,strmul,strdiv;
	String str;
	Integer i1,i2;
	int sum,sub,mul;
	float div;
	

	public void init()
	{
		lblno1 = new Label("1st Number: ");
		lblno2 = new Label("2nd Number: ");
		lblres = new Label("Result: ");

		txtno1 =new TextField(10);
		txtno2 =new TextField(10);
		txtadd =new TextField(10);
		txtsub =new TextField(10);
		txtmul =new TextField(10);
		txtdiv =new TextField(10);


		btnadd= new Button("Addition");
		btnsub= new Button("Substraction");
		btnmul= new Button("Multiplication");
		btndiv= new Button("Division");
		btnreset= new Button("Reset");

		add(lblno1);
		add(txtno1);
		add(lblno2);
		add(txtno2);
		add(btnreset);

		add(btnadd);
		add(txtadd);
		add(btnsub);
		add(txtsub);
		add(btnmul);
		add(txtmul);
		add(btndiv);
		add(txtdiv);

		btnadd.addActionListener(this);
		btnsub.addActionListener(this);
		btnmul.addActionListener(this);
		btndiv.addActionListener(this);
		btnreset.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		str = ae.getActionCommand();
		
		i1 = new Integer(txtno1.getText());
		i2 = new Integer(txtno2.getText());
		if(str=="Addition")
		{
		sum= i1+i2;
		strsum = Integer.toString(sum);
		txtadd.setText(strsum);
		}
		if(str=="Substraction")
		{
		sub=i1-i2;
		strsub = Integer.toString(sub);
		txtsub.setText(strsub);
		}
		if(str=="Multiplication")
		{
		mul=i1*i2;
		strmul = Integer.toString(mul);
		txtmul.setText(strmul);
		}
		if(str=="Division")
		{
		div=i1/i2;
		strdiv = Float.toString(div);
		txtdiv.setText(strdiv);
		}
		if(str=="Reset"){
		txtno1.setText("");
		txtno2.setText("");
		txtadd.setText("");
		txtsub.setText("");
		txtmul.setText("");
		txtdiv.setText("");
		}

		
		repaint();
		
	}
	public void paint(Graphics g)
	{
		
		
	}	

}