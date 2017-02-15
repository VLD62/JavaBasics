/**
 * Created by viliev on 15.2.2017 г..
 */
import java.util.Scanner;

public class CalculateValueTwoVariables {
    public static void main (String [] args){
        int a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number: ");
        a = in.nextInt();
        System.out.println("Input first number: ");
        b = in.nextInt();
        if (a == b){
            System.out.println("Numbers are equal!");
        } else {
            if (a > b) {
                System.out.println("Bigger number is " + a + " , smaller number is: " + b + " .");
            } else {
                System.out.println("Bigger number is " + b + " , smaller number is: " + a + " .");
            }
        }
    }
}
