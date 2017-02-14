import java.util.Scanner;

/**
 * Created by viliev on 14.2.2017 г..
 */
public class CompareTwoNumbers {
    public static void main (String [] args){
        int x,y;
        double max2;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        x = in.nextInt();
        System.out.println("Please enter second number: ");
        y =  in.nextInt();
        max2 = ((x+y) + (Math.sqrt(Math.pow(x-y, 2))))/2;
        System.out.println("Double check bigger number is: " + (int)(max2));
    }
}
