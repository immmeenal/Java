public class Parameterized {
     // constructor with one argument
    Parameterized(String name)
    {
        System.out.println("Constructor with one " +
                      "argument - String : " + name);
    }
 
    // constructor with two arguments
    Parameterized(String name, int age)
    {
 
        System.out.println("Constructor with two arguments : " +
                " String and Integer : " + name + " "+ age);
 
    }
 
    // Constructor with one argument but with different
    // type than previous..
    Parameterized(long id)
    {
        System.out.println("Constructor with one argument : " +
                                            "Long : " + id);
    }

    public static void main(String[] args) {
         Parameterized c1 = new Parameterized("Chhatre");
 
        // Invoke the constructor with two arguments
       Parameterized c2 = new Parameterized("Minal", 19);
 
        // Invoke the constructor with one argument of
        // type 'Long'.
        Parameterized c3 = new Parameterized(1234567);
    }
    
}
