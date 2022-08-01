package one.subone;

class subpack{
   void meth1(){
  System.out.println("i am subpackage of one package");
}
}
public class Test{
public static void main(String[] args){
    System.out.println("My name is sub package (one)");
    subpack s1 = new subpack();
     s1.meth1();
}
}