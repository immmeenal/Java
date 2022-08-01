import java.util.*;

public class VectorPRG {

    
    public static void main(String[] args) {
        Vector v = new Vector(3,2);
        System.out.println("Initial Size : "+v.size());
        System.out.println("Initial Size : "+v.capacity());
        System.out.println("4 Integer added");
        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
        System.out.println("Capacity after four additions : "+v.capacity());
        System.out.println("3 Double added");
        v.addElement(new Double(5.45));
        v.addElement(new Double(6.08));
        v.addElement(new Double(5.23));
        System.out.println("Current Capacity : "+v.capacity());
        System.out.println("2 Float added");
        v.addElement(new Float(7.07));
        v.addElement(new Float(8.17));
        System.out.println("Current Capacity : "+v.capacity());
        System.out.println("1 string added");
        v.addElement(new String("Minal"));
        System.out.println("Current Capacity : "+v.capacity());
        System.out.println("first element : "+v.firstElement());
        System.out.println("last element : "+v.lastElement());
        if(v.contains(4)){
            System.out.println("Vector contains: 4");
        }
        Enumeration vEnum = v.elements();
        System.out.println("Elements in Vector: ");
        while(vEnum.hasMoreElements()){
            System.out.print(vEnum.nextElement()+ " ");
            
        }
        System.out.println();
        
        
    }
    
}
