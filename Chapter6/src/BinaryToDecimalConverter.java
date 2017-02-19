import java.util.Scanner;

/**
 * Created by vld62 on 2/18/17.
 */
public class BinaryToDecimalConverter {
    public static void main (String [] args){
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
