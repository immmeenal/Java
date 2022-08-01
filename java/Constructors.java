public class Constructors {
    int num;
    String name;
    Constructors(){
        System.out.println("Default Constructor called");
    }
    public static void main(String[] args) {
      Constructors c1 = new Constructors();
      System.out.println(c1.name);
      System.out.println(c1.num);
    }
    
}
