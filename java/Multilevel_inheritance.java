


class Base{
   public int x = 1;
   protected int y = 2;
   int z=3;
   private int l=4;
   public void base_meth1(){
       System.out.println("Base_meth1 x= "+x);
        System.out.println("Base_meth1 y= "+y);
         System.out.println("Base_meth1 z= "+z);
          System.out.println("Base_meth1 l= "+l);
   }
   protected void base_meth2(){
       System.out.println("Base_meth2 x= "+x);
        System.out.println("Base_meth2 y= "+y);
         System.out.println("Base_meth2 z= "+z);
          System.out.println("Base_meth2 l= "+l);
   }
    void base_meth3(){
       System.out.println("Base_meth3 x= "+x);
        System.out.println("Base_meth3 y= "+y);
         System.out.println("Base_meth3 z= "+z);
          System.out.println("Base_meth3 l= "+l);
   }
   private void base_meth4(){
       System.out.println("Base_meth4 x= "+x);
        System.out.println("Base_meth4 y= "+y);
         System.out.println("Base_meth4 z= "+z);
          System.out.println("Base_meth4 l= "+l);
   }
    
}
class Derived1 extends Base{
    public int a = 5;
   protected int b = 6;
   int c=7;
   private int d=8;
   public void meth2(){
        System.out.println("Derived1 a= "+a);
         System.out.println("Derived2 b= "+b);
          System.out.println("Derived3 c= "+c);
           System.out.println("Derived5 d= "+d);
   }
    
    
}
class Derived2 extends Derived1{
  public int p = 9;
   protected int q= 10;
   int r=11;
   private int s=12;
   public void meth3(){
        System.out.println("Derived2 p= "+p);
         System.out.println("Derived2 q= "+q);
          System.out.println("Derived2 r= "+r);
           System.out.println("Derived2 s= "+s);
   }
    
    
}
public class Multilevel_inheritance {

   
    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
//        variables
        System.out.println("Accessing variables of base class by creating obj of Derived2 class");
        System.out.println("Base_meth1 x= "+d2.x);
        System.out.println("Base_meth1 y= "+d2.y);
         System.out.println("Base_meth1 z= "+d2.z);
//          System.out.println("Base_meth1 l= "+d2.l); not allowed becz its private variable

//        methods
        System.out.println("Accessing methods of Base class by creating obj of Derived2 class");
        d2.base_meth1();
        d2.base_meth2();
        d2.base_meth3();
//        d2.base_meth4();  not allowed becz its private method
  System.out.println("Accessing methods of Derived1 class by creating obj of Derived2 class");
        d2.meth2();
          System.out.println("Accessing methods of own class by creating obj of Derived2 class");
        d2.meth3();
    }
    
}
