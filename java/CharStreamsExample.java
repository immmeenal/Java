import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
class CharStreamsExample{

 public static void main(String[] args) throws IOException
 {
 int ch;
 //Write in file
 String str = "File Handling in Java using"; 

 FileWriter fw=new FileWriter("file2.txt");

 for (int i = 0; i < str.length(); i++)
 fw.write(str.charAt(i));
 System.out.println("Writing successful");
 fw.close();

 //Read file
 FileReader fr=null;
 try
 {
 fr = new FileReader("file2.txt");
 }
 catch (FileNotFoundException fe)
 {
 System.out.println("File not found");
 }
 // read from FileReader till the end of file
 while ((ch=fr.read())!=-1)
 System.out.print((char)ch);
 fr.close();
 }
}