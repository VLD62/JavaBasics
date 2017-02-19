import java.util.Scanner;

/**
 * Created by vld62 on 2/18/17.
 */
public class DecimalToBinaryConverter {
    public static void main (String [] args){
        int N, remainder =0;
        String binary = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter decimal number: ");
        N = in.nextInt();
        while(N > 0){
            remainder = N % 2;
            N /=2;
            binary = remainder + binary;

        }
        System.out.println("Binary number is: " + binary);
    }
}
