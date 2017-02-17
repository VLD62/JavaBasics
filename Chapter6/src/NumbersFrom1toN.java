import java.util.Scanner;

/**
 * Created by vld62 on 2/16/17.
 */
public class NumbersFrom1toN {
    public static void main(String[] args) {
        int s = 0, l = 0;
        Scanner input = new Scanner(System.in);
        //Read user  input.
        System.out.println("Enter total count of all numbers: ");
        int num = input.nextInt();

        System.out.println("Enter numbers :");
        for (int i = 0; i < num; i++) {
            int x = input.nextInt();
            if (i == 0) {
                s = x;
                l = x;
            }
            if (x < s) {
                s = x;
            }
            if (x > l) {
                l = x;
            }

        }
        System.out.println("\n" + "Smallest number is: " + s);
        System.out.println("\n" + "Biggest number is: " + l);
    }
}



