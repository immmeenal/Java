import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="BorderDemo" width=500 height=500>
</applet>*/

public class BorderDemo extends Applet
{
	public void init()
	{
		setLayout(new BorderLayout());

		add(new Button("Top"), BorderLayout.NORTH );
		add(new Button("Bottom"), BorderLayout.SOUTH);
		add(new Button("Right"),BorderLayout.EAST);
		add(new Button("Left"),BorderLayout.WEST);

		String msg = "s gfiuheoiero"+"k hfeih \n"+"ddbxwiwhroox\n";

		add(new TextArea(msg),BorderLayout.CENTER);
	}

}