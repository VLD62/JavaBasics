import java.util.Scanner;

/**
 * Created by vld62 on 3/3/17.
 * Да се напише програма, която преобразува двоично число в десетично.
 */
public class ConvertBinaryToDecimal {
    public static void main (String [] Args){
        int N, decimal =0 , p = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter binary number: ");
        N = in.nextInt();
        while(true){
            if(N == 0){
                break;
            } else {
                int temp = N%10;
                decimal += temp*Math.pow(2, p);
                N = N/10;
                p++;
            }
        }
        System.out.println("Decimal number is: " + decimal);
    }
}
