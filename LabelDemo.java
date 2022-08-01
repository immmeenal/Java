import java.awt.*;
import java.applet.*;

/*
<applet code="LabelDemo" width=400 height=500>
</applet>
*/

public class LabelDemo extends Applet
{
	public void init()
	{
	Label lblname = new Label("Name");
	Label lblsurname = new Label("Surname");

	add(lblname);
	add(lblsurname);
	}


}