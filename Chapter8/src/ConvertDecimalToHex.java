import java.util.Scanner;

/**
 * Created by vld62 on 3/3/17.
 * Да се напише програма, която преобразува десетично число в
 шестнадесетично.
 */
public class ConvertDecimalToHex {

    public static void main (String [] args){
    int N, remainder =0;
    String hex = "";
    char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6',
            '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    Scanner in = new Scanner(System.in);
    System.out.println("Enter decimal number: ");
    N = in.nextInt();
    while(N > 0){
        remainder = N % 16;
        hex = hexDigits[remainder] + hex;
        N = N / 16;
    }
    System.out.println("Hexadecimal number is: " + hex);
        }
}
