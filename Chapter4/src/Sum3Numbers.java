/**
 * Created by vld62 on 2/13/17.
 */
import java.util.Scanner;
public class Sum3Numbers {
    public static void main (String [] args){
        int a,b,c;
        Scanner in= new Scanner(System.in);
        System.out.println("Select first number:");
        a = in.nextInt();
        System.out.println("Select second number:");
        b = in.nextInt();
        System.out.println("Select third number:");
        c = in.nextInt();
        System.out.println("Sum of all numbers is: " + (a + b + c) +".");
    }


}
