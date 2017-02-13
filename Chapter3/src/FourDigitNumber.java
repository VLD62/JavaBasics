/**
 * Created by viliev on 13.2.2017 г..
 */
import java.util.Scanner;

public class FourDigitNumber {
    public static void main (String [] args){
        //Input number
        int num1;
        String digitStr;
        Scanner in= new Scanner(System.in);
        //Input number from console
        System.out.println("Enter 4 digit number: ");
        num1 = in.nextInt();
        if (num1 > 9999 | num1 < -9999) {
            System.out.println("Sorry this program is working only with 4 digits numbers");
        } else {
            digitStr  = Integer.toString(num1);
            String firstDigit = Character.toString(digitStr.charAt(0));
            String secondDigit = Character.toString(digitStr.charAt(1));
            String thirdDigit = Character.toString(digitStr.charAt(2));
            String fourthDigit = Character.toString(digitStr.charAt(3));
            //Convert strings to int
            int digit1 =  Integer.parseInt(firstDigit);
            int digit2 =  Integer.parseInt(secondDigit);
            int digit3 =  Integer.parseInt(thirdDigit);
            int digit4 =  Integer.parseInt(fourthDigit);
            //Display sum of all digits
            System.out.println("Sum of all digits in this number is: " + (digit1 + digit2 + digit3 + digit4));
            System.out.println("Print digits in reverse order: " + digit4 + digit3 + digit2 + digit1);
            System.out.println("Print last in first: " + digit4 + digit1 + digit2 + digit3);
            System.out.println("Swap second and third digit: " + digit1 + digit3 + digit2 + digit4);
        }
    }
}
