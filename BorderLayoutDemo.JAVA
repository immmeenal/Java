import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="BorderLayoutDemo" width=400 height=500>
</applet> */

public class BorderLayoutDemo extends Applet
{
	public void init(){
	setLayout(new BorderLayout());
	add(new Button("NORTH"),BorderLayout.NORTH);
	add(new Button("SOUTH"),BorderLayout.SOUTH);
	add(new Button("EAST"),BorderLayout.EAST);
	add(new Button("WEST"),BorderLayout.WEST);
	TextArea msg = new TextArea("This is the center text");
	add(msg,BorderLayout.CENTER);

	}

}