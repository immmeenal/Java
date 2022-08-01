public class ConstructorOverloading {
    int a;
    double b;
    String c;
    ConstructorOverloading(){
        a=100; 
        b= 22.22;
        c="Minal";
        System.out.println(a+" "+b+" "+c);
        
    }
    ConstructorOverloading(int x){
        a=x;
        System.out.println(a);
    }
    ConstructorOverloading(double y, String z){
        b=y;
        c=z;
        System.out.println(b+" "+c);
    }
    public static void main(String[] args) {
       ConstructorOverloading c1 = new ConstructorOverloading();
       ConstructorOverloading c2 = new ConstructorOverloading(4);
       ConstructorOverloading c3 = new ConstructorOverloading(2.3,"Chhatre");
    }
    
}