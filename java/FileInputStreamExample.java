import java.io.FileInputStream;

public class FileInputStreamExample{

public static void main(String args[]){

 try{
  
 FileInputStream fin=new FileInputStream("D:/java/input.txt");
 
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







