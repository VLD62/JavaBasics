/**
 * Created by vld62 on 2/12/17.
 */
import java.util.Scanner;
public class CheckNumberDivide5or7 {
    public static void main (String [] args){
        //Input number
        int num1;
        Scanner in= new Scanner(System.in);
        //Input number from console
        System.out.println("Enter number: ");
        num1 = in.nextInt();

        if ((num1 % 5 == 0) & (num1 % 7 ==0)) {
            System.out.println("Number can be divided by 5 or 7");
        } else {
            System.out.println("Number can't be divided by 5 or 7");
        }

    }
}
