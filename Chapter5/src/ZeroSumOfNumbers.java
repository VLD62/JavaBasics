import java.util.Scanner;

/**
 * Created by viliev on 15.2.2017 г..
 */
public class ZeroSumOfNumbers {
    public static void main (String [] args){
        int x,y,z;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        x =  in.nextInt();
        System.out.println("Please enter second number: ");
        y =  in.nextInt();
        System.out.println("Please enter third number: ");
        z =  in.nextInt();
        if (x + y == 0 | x+z == 0 | y+z == 0){
            if (x + y == 0 && x+z != 0 && y+z != 0) {
                System.out.println("Numbers which sum is zero are: " + x + " " + y);
            }
             if (x + y != 0 && x+z == 0 && y+z != 0) {
                System.out.println("Numbers which sum is zero are: " + x + " " + z);
            }
             if (x + y != 0 && x+z != 0 && y+z == 0) {
                System.out.println("Numbers which sum is zero are: " + y + " " + z);
            }
            if (x + y == 0 && x+z == 0) {
                System.out.println("Numbers which sum is zero are: " + x + " " + z);
            }
            if (x + y == 0 && y+z == 0) {
                System.out.println("Numbers which sum is zero are: " + y + " " + z);
            }
            if (x + z == 0 && y+z == 0) {
                System.out.println("Numbers which sum is zero are: " + y + " " + z);
            }
        } else {
           System.out.println("Sum of numbers is not zero in any case.");
        }

    }
}
