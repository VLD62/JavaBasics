import java.util.Scanner;

/**
 * Created by vld62 on 2/18/17.
 */
public class ZeroesInFactorial {
    public static void main (String [] args){
        int N,factorialN = 1,zeroes = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number N: ");
        N = in.nextInt();
        for (int i = 1 ; i <= N ; i++ ) {
            factorialN = factorialN * i;
        }
        System.out.println("Factorial of N is: " + factorialN);
        while(factorialN%10 == 0 && factorialN != 0){
            zeroes++;
            factorialN/= 10;
        }
        System.out.println("Number of trailing zeroes in factorial of N is: " + zeroes);
    }
}
