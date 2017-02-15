import java.util.Scanner;

/**
 * Created by viliev on 15.2.2017 г..
 */
public class ShowBiggestOf3Numbers {
    public static void main (String [] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        a = in.nextInt();
        System.out.println("Please enter second number: ");
        b = in.nextInt();
        System.out.println("Please enter third number: ");
        c = in.nextInt();

        if (a > b && a > b && a > c)
            System.out.println("Bigger number is:  " + a);
        else if (b > a && b > c)
            System.out.println("Bigger number is:  " + b);
        else if (c > a && c > b)
            System.out.println("Bigger number is:  " + c);
        else
            System.out.println("Numbers that you entered are not distinct.");
    }
}
