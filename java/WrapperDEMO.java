public class WrapperDEMO {

    public static void main(String[] args) {
      Integer myInt = 5;
      Double myDouble = 3.66;
      Character myChar = 'M';
      System.out.println(myInt);
      System.out.println(myDouble);
      System.out.println(myChar);
      
      //get value by corresponding wrapper object
      System.out.println(myInt.intValue());
      System.out.println(myDouble.doubleValue());
      System.out.println(myChar.charValue());
      
      //covert wrapper objects to string
      String myString = myInt.toString();
      System.out.println(myString.length());
      
      //convert object to primitive (unboxing)
      Float f1 = new Float(2.3);
      int i = f1.intValue();
      double d = f1.doubleValue();
      short s = f1.shortValue();
      long l = f1.longValue();
      byte b = f1.byteValue();
      float f = f1.floatValue();
      
      //convert primitive to object (boxing)
      int m1 = 105;
      Integer m2 = Integer.valueOf(m1);
      System.out.println(" valueOf(m1): " +m2);
      
      //convert string in respective primitive
      String s1 = "1234567890";
      int st = Integer.parseInt(s1);
      
      //compare method
      
        byte num4 = 11;
        byte num5 = 20;
        
        int a = Byte.compare(num4, num5);
        System.out.print("compare(num4, num5) = ");
        if (a == 0) {
            System.out.println("equals");
        } else if (a < 0) {
            System.out.println("true");

        } else {
            System.out.println("false");

        }
        
      
    }
    
}
