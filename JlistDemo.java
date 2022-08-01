import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code = "JlistDemo" width = 400 height=400>
</applet>
*/

public class JlistDemo extends JApplet implements ListSelectionListener{

Jlist jlist;
JLable jlab;
JScrollPane jsp;

//create an array of cities
String cities[] = {"New-York","India"};

public void init()
{
	//change to flowlayout
	setLayout (new FlowLayout());

	//create a JList
	jlist = new JList(cities);

	//set the list selection mode to single selection
	jlist = setSelectionMode (ListSelectionMode.SINGLE_SELECTION);
	jsp = new JScrollPane(jlist);

	//set thepreffered size of all scrollpane

	jsp.setPrefferedSize(new Dimention(120,90));
	
	//make label that displays the selection
	jlab = new JLabel("Choose a city");
	
	//add list and label to content pane
	add(jsp);
	add(jlab);

	jlist.addListSelectionListener(this);
}
public void valueChanged(ListSelectionEvent le)
{
	//get the index of the changed item
	int idx = jlist.getSelectedIndex();

	//display selection, if item was selected
	if(idx!=-1)
	{
		jlab.setText("Current selection:",cities[idx]);
	}
	else
	{
		jlab.setText("Choose a city");
	}
}
}