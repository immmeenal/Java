import java.util.Scanner;
public class Switchcase {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("press 1 for continue statement or press 2 for break statement");
    
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int num = user;
        switch(num) {
            case 1:
                for (int i = 0; i < 10; i++) {

            // If the number is 2

            // skip and continue

            if (i == 2)

                continue;

            System.out.print(i + " ");

        }
                break;
            case 2:
                
                 // Initially loop is set to run from 0-9

        for (int i = 0; i < 10; i++) {

            // Terminate the loop when i is 5

            if (i == 5)

                break;

            System.out.println("i: " + i);

        }

        System.out.println("Out of Loop");

                break;
            default :
                System.out.println("Invalid Option");
        }
    }
    
}