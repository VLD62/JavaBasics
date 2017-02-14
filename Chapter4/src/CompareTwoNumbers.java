import java.util.Scanner;

/**
 * Created by viliev on 14.2.2017 г..
 */
public class CompareTwoNumbers {
    public static void main (String [] args){
        int v,x,y,z,max;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        x = in.nextInt();
        System.out.println("Please enter first number: ");
        y =  in.nextInt();
        v = (x - y);
        z = (v >> 1) & 0x1;
        max = x - (z * v);

        System.out.println("Bigger number is: "+max);
    }
}
