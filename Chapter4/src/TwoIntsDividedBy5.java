import java.util.Scanner;

/**
 * Created by vld62 on 2/13/17.
 */
public class TwoIntsDividedBy5 {
    public static void main (String [] args) {
        int a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        a = in.nextInt();
        System.out.println("Enter number 2: ");
        b = in.nextInt();
        for (int i = a; i <= b; i++){
            if (i % 5 == 0) {
                System.out.print(i + " " + "\n");
            }

        }

    }
}
