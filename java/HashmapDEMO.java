import java.util.*;

public class HashmapDEMO {

    
    public static void main(String[] args) {
        //creating HashMap
        HashMap<Integer,String>map = new HashMap<Integer,String>();
        //put elements in Map
        map.put(22,"Seeta");
        map.put(19,"Nita");
        map.put(16,"Minal");
        
        System.out.println("Iterating HashMap: ");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+ ":" + m.getValue());
        }
    }
    
}