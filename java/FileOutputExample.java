import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class FileOutputExample {
 public static void main(String args[])
 {
 try {
 FileOutputStream fout = new FileOutputStream("file.txt");
 String s = "This program is for write and read in file using Byte stream";
 byte b[] = s.getBytes();
 fout.write(b);
 fout.close();
 }
 catch (IOException e) {
 System.out.println(e);
 }
 try{
 FileInputStream fin=new FileInputStream("file.txt");
 int size = fin.available();
 int i=fin.read();
 System.out.print((char)i);
 for (int j=0; j < size; j++) {
 System.out.print((char) fin.read());
 }
 fin.close();
 }
 catch(Exception e){
 System.out.println(e);
 }
 }
 }