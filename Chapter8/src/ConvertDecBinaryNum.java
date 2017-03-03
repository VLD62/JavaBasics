/**
 * Created by viliev on 2.3.2017 г..
 * Да се напише програма, която преобразува десетично число в двоично.
 */
import java.util.Scanner;
public class ConvertDecBinaryNum {
    public static void main (String [] Args){
        int N;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number: ");
        N = in.nextInt();
        System.out.println("Number " + N + " converted in binary is: " + Integer.toBinaryString(N));
    }
}
