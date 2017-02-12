/**
 * Created by vld62 on 2/12/17.
 */
import java.util.Scanner;

public class Check3rdBitOfNumber {
    public static void main (String [] args){
        //Input number
        int num1;
        String digit3;
        String digit2;
        Scanner in= new Scanner(System.in);
        //Input number from console
        System.out.println("Enter number: ");
        num1 = in.nextInt();
        digit2 = Integer.toBinaryString(num1);
        digit3 = Integer.toString(num1);
        System.out.println("Num2 is :" + digit2);
        System.out.println("Num2 is :" + digit3);
        if ( Character.toString(digit2.charAt(2)).equals("0")) {
            System.out.println("3rd bit contains 0");
        } else {
            System.out.println("3rd bit contains 1");
        }
    }
}
