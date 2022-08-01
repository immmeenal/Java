import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<Applet code="CourseReg" width=400 height=400>
</Applet> */

public class CourseReg extends Applet implements ActionListener , ItemListener{

	Label lblcourse, lblgender;
	Checkbox chkjp2,chkpython,chkandroid,chkcs,chkdatamining, chkproject,chkmale,chkfemale;
	CheckboxGroup cbg = new CheckboxGroup();
	Button btnsubmit;
	String msg,str;

	public void init(){
		Label Title = new Label("COURSE REGISTRATION FORM");
		Label lblfname = new Label("First name");
		Label lblmname = new Label("Middle name");
		Label lbllname = new Label("Last name"); 

		lblcourse = new Label("courses:");
		chkjp2 = new Checkbox("JAVA PROGRAMMING 2");
		chkpython = new Checkbox("PYTHON");
		chkandroid= new Checkbox("ANDROID");
		chkcs= new Checkbox("COMPUTER SECURITY");
		chkdatamining = new Checkbox("DATA MINING");
		chkproject= new Checkbox("PROJECT");
		
		lblgender = new Label("Gender");
		
		chkmale = new Checkbox("Male", cbg, false);
		chkfemale = new Checkbox("Female", cbg, false);

		TextField fieldcol1 = new TextField(4);
		TextField fieldcol2 = new TextField(4);
		TextField fieldcol3 = new TextField(4);


		btnsubmit = new Button("submit");
		
		add(Title );
		add(lblfname);
		add(fieldcol1);
		add(lblmname);
		add(fieldcol2);
		add(lbllname);
		add(fieldcol3);

		add(lblgender);
		add(chkmale);
		add(chkfemale);

		add(lblcourse);

		add(chkjp2);
		add(chkpython );
		add(chkandroid);
		add(chkcs);
		add(chkdatamining );
		add(chkproject);
	
		add(btnsubmit);
		
		chkjp2.addItemListener(this);
		chkpython.addItemListener(this);
		chkandroid.addItemListener(this);
		chkcs.addItemListener(this);
		chkdatamining.addItemListener(this);
		chkproject.addItemListener(this);
		
		chkmale.addItemListener(this);
		chkfemale.addItemListener(this);

		btnsubmit.addActionListener(this);
	
	}//end of init

	public void itemStateChanged(ItemEvent IE){
		repaint();
	}

	public void actionPerformed(ActionEvent AE){
		str = AE.getActionCommand();
		msg="You clicked on "+str +" ";
		
	}
	
	public void paint(Graphics g){
		

		
		str= "JAVA PROGRAMMING 2"+ " " +chkjp2.getState();
			g.drawString(str,300, 100);

		str="PYTHON"+ " " +chkpython.getState();
			g.drawString(str,300, 120);

		str= "ANDROID"+" " +chkandroid.getState();
			g.drawString(str,300, 140);

		str= "COMPUTER SECURITY" +" " +chkcs.getState();
			g.drawString(str,300, 160);

		str= "DATA MINING"+" " +chkdatamining.getState();
			g.drawString(str,300, 180);

		str= "PROJECT"+" " +chkproject.getState();
			g.drawString(str,300, 200);

		str ="  "+cbg.getSelectedCheckbox().getLabel();
			g.drawString("Gender" + str, 300 , 220);	
			
			g.drawString(msg, 300,240);
	
		
		
	}

}
