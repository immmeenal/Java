import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="GridDemo" width=500 height=500>
</applet>*/

public class GridDemo extends Applet
{
	static final int n=4;
	public void init()
	{
		setLayout(new GridLayout(n,n));

		for(int i=1;i<=n*n-1;i++)
		{
			add(new Button(""+i));
		}
	}

}