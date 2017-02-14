/**
 * Created by viliev on 14.2.2017 г..
 */
import java.util.Scanner;

public class Sum5Numbers {
    public static void main (String [] args) {
        int a,b,c,d,e;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = in.nextInt();
        System.out.println("Enter second number: ");
        b = in.nextInt();
        System.out.println("Enter third number: ");
        c = in.nextInt();
        System.out.println("Enter fourth number: ");
        d = in.nextInt();
        System.out.println("Enter fifth number: ");
        e = in.nextInt();
        System.out.println("Sum of all numbers is: "+ (a+b+c+d+e) +".");
    }


}
