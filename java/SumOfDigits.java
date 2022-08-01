public class SumOfDigits {

    public static void main(String[] args) {
        // TODO code application logic here
        int num = 256;
        int rem = 0;
        int sum = 0;
        int x = num;
         System.out.println(num + "=");
        while(x>0){
            rem = x % 10;
            sum = sum + rem;
            x = x / 10;
            System.out.println(rem + "+");
        }
        System.out.println("=" + sum);
    }
    
}