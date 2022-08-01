

public class Fibonacci {

   
    public static void main(String[] args) {
        // TODO code application logic here
        int n1=0,n2=1,n3,i,count=11;
        System.out.println(n1+" "+n2);//printing 0 and 1
        for(i=2;i<count;i++)
        {
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }
                
    }
    
}
