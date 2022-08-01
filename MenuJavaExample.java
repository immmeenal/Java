import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class MenuExample extends Frame
{
	MenuExample()
	{
		//create menubar and add to frame
		MenuBar mBar = new MenuBar();
		setMenuBar(mBar);
		//create the menu and menu items
		Menu menuFile = new Menu("File");
		MenuItem ItemOpen = new MenuItem("Open");
		MenuItem ItemSave = new MenuItem("Save");
		MenuItem ItemExit = new MenuItem("Exit");

		//add menu items to menu
		menuFile.add(ItemOpen);
		menuFile.add(ItemSave);
		menuFile.add(ItemExit);

		//create menu and menu items
		Menu menuEdit = new Menu("Edit");
		MenuItem ItemCopy = new MenuItem("Copy");

		//add menuitems to menu
		menuEdit.add(ItemCopy);

		Menu menuView = new Menu("View");
		
		mBar.add(menuFile);
		mBar.add(menuEdit);
		mBar.add(menuView);

	}

}
class MenuJavaExample
{
	public static void main(String[] args)
	{
		MenuExample Frame = new MenuExample();
		Frame.setTitle("Menu in javaEx");
		Frame.setSize(300,300);
		Frame.setVisible(true);
	}
}