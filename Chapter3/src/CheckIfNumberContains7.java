import java.util.Scanner;

/**
 * Created by vld62 on 2/12/17.
 */
public class CheckIfNumberContains7 {
    public static void main (String [] args){
        //Input number
        int num1;
        int digit3;
        Scanner in= new Scanner(System.in);
        //Input number from console
        System.out.println("Enter number: ");
        num1 = in.nextInt();
        digit3 = String(num1+"a").charAt(3);
        System.out.println("Num2 is :" + digit3);
        if ( digit3 == 7) {
            System.out.println("Number contains 7 as 3rd digit");
        } else {
            System.out.println("Number does not contain 7 as 3rd digit");
        }
    }
}
