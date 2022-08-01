class Base{
    int x = 3;
    void meth1(){
    System.out.println("base class var: "+x);
}
}

class Derived extends Base {
    
    int y =4;
    void meth2(){
        System.out.println("derived class var: "+y);
    }
    
}

class Single_inheritance{

 public static void main(String[] args) {
        
     Derived d1 = new Derived();
     d1.meth1();
     d1.meth2();
     Base b1 = new Base();
     b1.meth1();
//     b1.meth2();  not possible
    }
 
}
