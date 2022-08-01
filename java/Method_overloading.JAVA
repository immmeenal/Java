class Overload{
    void test(){
        System.out.println("No Parameter");
    }
    void test(int a){
        System.out.println("Overloading with 1 parameter : "+ a);
    }
    void test(int a, int b){
        System.out.println("Overloading with 2 parameters first: "+ a+ " second: "+ b);
    }
    double test(double a, double b){
        return (a+b);
    }
    
}

public class Method_overloading {

  
    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.test();
        obj.test(20);
        obj.test(20, 30);
        double result = obj.test(10.0, 20.0);
        System.out.println("Addition: "+result);
      
    }
    
}
