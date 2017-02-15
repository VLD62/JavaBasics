/**
 * Created by viliev on 15.2.2017 г..
 */
import java.util.Scanner;

public class CheckSignOfQuotient {
    public static void main(String[] args) {
    int a, b;
    Scanner in = new Scanner(System.in);
    System.out.println("Input first number: ");
    a =in.nextInt();
    System.out.println("Input second number: ");
    b =in.nextInt();

    if (a > 0 && b > 0) {
        System.out.println("Quotient is positive.");
    }
    else if (a < 0 && b > 0){
        System.out.println("Quotient is negative.");
    }
    else if (a > 0 && b < 0) {
            System.out.println("Quotient is negative.");
    }
    else if (a < 0 && b < 0) {
          System.out.println("Quotient is positive.");
    }

    }
}
