import java.util.Scanner;
public class StringMethods {

    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int num1;
       
        System.out.println("Enter any string: ");
        String str = sc.nextLine();
        System.out.println("Original string: "+str);
        
        StringBuffer strb = new StringBuffer("Minal Chhatre");
        System.out.println("String Buffer Original string: "+strb);
        
        do{
        System.out.println("Enter 1 for string methods and 2 for string buffer methods ");
        int num = sc.nextInt();
        
        switch(num){
            case 1:
                    System.out.println("Using string methods: ");
                    System.out.println("1. Original string: "+str);
                    System.out.println("2. String length: "+str.length());
                    System.out.println("3. String lowercase: "+str.toLowerCase());
                    System.out.println("4. String uppercase: "+str.toUpperCase());
                    System.out.println("5. String trim: "+str.trim());
                    System.out.println("6. String substring 2-4: "+str.substring(2,4));
                    System.out.println("7. String replace c with m: "+str.replace('c','m'));
                    System.out.println("8. String starting 'char'?: "+str.startsWith("char"));
                    System.out.println("9. String ending 'abs'?: "+str.endsWith("abs"));
                    System.out.println("10. String character at 3: "+str.charAt(3));
                    System.out.println("11. String index of 'c': "+str.indexOf("c"));
                    System.out.println("12. String last index of 'c': "+str.lastIndexOf("c"));
                    System.out.println("13. String equals to 'Characteristics': "+str.equals("Characteristics"));
                    System.out.println("14. String equals to 'Characteristics' - ignoring case:"+str.equalsIgnoreCase("Characteristics"));
            break;
            case 2:
                    System.out.println("1. Original string: "+strb);
                    System.out.println("2. String capacity: "+strb.capacity());
                    System.out.println("3. String append: "+strb.append(" : )"));
                    System.out.println("4. String length: "+strb.length());
                    System.out.println("5. String character at 3: "+strb.charAt(3));
                    System.out.println("6. Substring 4-6"+strb.substring(4,6));
                    System.out.println("7. String delete: "+strb.delete(4,6));
                    System.out.println("8. String indexof: "+strb.indexOf("a"));
                    System.out.println("9. String last indexof: "+strb.lastIndexOf("a"));
                    System.out.println("10. String insert: "+strb.insert(3,"zzz"));
                    System.out.println("11. String set length: "+strb.reverse());
  
            break;
            default:
                System.out.println("Enter Valid option ");
                
            
        }
        System.out.println("Do you want to continue process? Press 0 ");
        num1 = sc.nextInt();
        }while(num1==0);




    }
    
}
