import java.util.Scanner;

/**
 * Created by vld62 on 3/3/17.
 * Да се напише програма, която преобразува двоично число в шестна-
 десетично.
 */
public class ConvertBinaryToHex {

    public static void main (String [] args){
        int binary, decimal = 0, N, p = 0;
        String hex;
        Scanner in  = new Scanner(System.in);
        System.out.println("Please enter binary number: ");
        binary = in.nextInt();
        System.out.println("Entered binary number is " + binary);
        //Convert binary to decimal
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, p);
                binary = binary/10;
                p++;
            }
        }
        //Convert decimal to hex
        hex = dec2hex(decimal);
        System.out.println("Converted hexadecimal from binary is " + hex +".");

    }

    public static String dec2hex (int N){
    int remainder =0;
    String hex = "";
    char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6',
            '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while(N > 0){
        remainder = N % 16;
        hex = hexDigits[remainder] + hex;
        N = N / 16;
    }
    return hex;
    }
}
