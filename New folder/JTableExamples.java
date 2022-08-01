
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExamples {
JFrame f;
JTable j;
JTableExamples()
{
f = new JFrame();
f.setTitle("JTable Example");
String[][] data = {
	{ "Chaitanya Chaudhari", "1926009", "CS" },
	{ "Sai Gaikwad", "1926014", "CS" },
	{ "Aditya Bhosle", "1926008", "CS" },
	{ "Kaushal Chawale", "1926010", "CS" },
	{ "Naru Khamkar", "1926029", "CS" },
	{ "Onkar Vaidya", "1926065", "CS" }
};
	String[] columnNames = { "Name", "Roll Number", "Department" };
	j = new JTable(data, columnNames);
	j.setBounds(30, 40, 200, 300);
	JScrollPane sp = new JScrollPane(j);
	f.add(sp);
	f.setSize(500, 200);
	f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new JTableExamples();
	}
}
