class Base{
    void meth1(){
        System.out.println("Base class method");
    }
}

class Method_overriding extends Base{

   void meth1(){
        System.out.println("Derived class method");
    }
    public static void main(String[] args) {
      Method_overriding obj = new Method_overriding();
      obj.meth1();
    }
    
}