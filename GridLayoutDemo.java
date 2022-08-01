import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="GridLayoutDemo" width=400 height=400>
</applet>
*/

public class GridLayoutDemo extends Applet
{
static final int n=4;
	public void init()
	{
		setLayout(new GridLayout(n,n));

		for(int i=0;i<n*n-1;i++)
		{
			add(new Button("" +i));
			
		}
	}
}