import java.util.Scanner;

/**
 * Created by vld62 on 2/12/17.
 */
public class OddOrEvenCheck {
    public static void main (String [] args){
        //Input number
        int num1;
        Scanner in= new Scanner(System.in);
        //Input number from console
        System.out.println("Enter number: ");
        num1 = in.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("Number is even!");
        } else {
            System.out.println("Number is odd!");
        }

    }
}
