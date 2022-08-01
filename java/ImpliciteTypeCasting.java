public class ImpliciteTypeCasting {

    public static void main(String[] args) {
        byte b = 20;
        
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        
        System.out.println("byte value = " +b);
        System.out.println("byte value = " +s);
        System.out.println("byte value = " +i);
        System.out.println("byte value = " +l);
        System.out.println("byte value = " +f);
        System.out.println("byte value = " +d);
        
        
    }
    
}
