/**
 * Created by viliev on 13.2.2017 г..
 */
import java.util.Scanner;

public class PrintBitValue {
    public static void main (String [] args) {
        int n;
        int p;
        int v;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter number: ");
        n = in.nextInt();
        System.out.println("Enter position: ");
        p = in.nextInt();
        System.out.println("Enter value 0 or 1: ");
        v = in.nextInt();
        char vChar = Character.forDigit(v,10);

        if (v >= 0 && v <=1) {
            System.out.println("Value of v is: " + v);
            System.out.println("Value of vChar is: " +vChar);
            String binaryIntInStr = Integer.toBinaryString(n);
            System.out.println("Binary value is: " + binaryIntInStr);
            char bitA = binaryIntInStr.charAt(p);
            System.out.println("Binary value of bit number " + p +" is: " + bitA);
            String binaryIntInStr2 = Integer.toBinaryString(n);
            char[] newBinary = binaryIntInStr2.toCharArray();
            newBinary[p] = vChar;
            binaryIntInStr2 = String.valueOf(newBinary);
            System.out.println("New binary value of bit number " + p + " was changed with value of "
                   + v + " and new value is " +  binaryIntInStr2);

        } else {
            System.out.println("Specified value is different than 0 or 1: ");
        }



    }
}
