import java.awt.*;

import java.awt.event.*;


class DialogDemo implements ActionListener 
{

	Dialog d;

	
	DialogDemo() 
	{
		
		Frame f = new Frame();

		d = new Dialog(f, "Dialog", true);

		d.setLayout(new FlowLayout());


		Button b = new Button("Close");

		b.addActionListener(this);

		d.add(new Label("You tap on "));

		d.add(b);
	
		d.setSize(400, 300);

		d.setVisible(true);

		f.add(d);
	
		f.addWindowListener(new WindowAdapter()
		{

			public void windowClosing(WindowEvent windowEvent)
			 {

				System.exit(0);

			 }
		
			});

		}

	
			@Override

			public void actionPerformed(ActionEvent e) 
			{

			this.d.setVisible(false);

			}

			}


			class FileDialogDemo
			{

			FileDialog fd;
		

	FileDialogDemo(String type) 
			{

				Frame f = new Frame();

				if (type.equals("Open")) 
				{

				fd = new FileDialog(f, "Open", FileDialog.LOAD);
		
		} 
				else
				 {

				fd = new FileDialog(f, "Open", FileDialog.SAVE);

				}

				fd.setVisible(true);
		
		f.add(fd);
	
				f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() 
				{

					public void windowClosing(WindowEvent windowEvent)
				 	{

					System.exit(0);

					}

					});

					}

					}


class MenuBarExample extends Frame implements ActionListener
{
	
	Menu menuFile = new Menu("File");

	Menu menuEdit = new Menu("Edit");

	MenuItem fItemNew = new MenuItem("New");

	MenuItem fItemOpen = new MenuItem("Open File");

	MenuItem fItemSave = new MenuItem("Save");


	MenuBarExample() {

		MenuBar mBar = new MenuBar();

		setMenuBar(mBar);


		menuFile.add(fItemNew);

		menuFile.add(fItemOpen);

		menuFile.add(fItemSave);


		menuEdit.add(new MenuItem("Undo"));

		menuEdit.add(new MenuItem("Redo"));

		menuEdit.add(new MenuItem("Cut"));

		menuEdit.add(new MenuItem("Copy"));

		menuEdit.add(new MenuItem("Paste"));


		fItemNew.addActionListener(this);

		fItemOpen.addActionListener(this);

		fItemSave.addActionListener(this);


		mBar.add(menuFile);

		mBar.add(menuEdit);

	}

	
@Override

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == fItemOpen) {

			new FileDialogDemo("Open");

		} else if (e.getSource() == fItemSave) {

			new FileDialogDemo("Save");
	
	}
	 else
	 {

			new DialogDemo();
	
	}

	}

}


public class MenuBarDemo
  {

	public static void main(String args[])
  {

		MenuBarExample frame = new MenuBarExample();

		frame.setTitle("MENU");

		frame.setSize(400, 500);

		frame.setResizable(false);

		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent windowEvent) {

				System.exit(0);

			}

		});

	}


}








