import java.util.Scanner;

/**
 * Created by vld62 on 2/18/17.
 *
 */
public class CatalanNumbers {
    public static void main (String [] args){
        int N,factorialN = 1,factorial2N = 1,factorial3N=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number N: ");
        N = in.nextInt();
        for (int i = 1 ; i <= N ; i++ ) {
            factorialN =  factorialN * i;
            //System.out.println("Factorial of N is: " + factorialN);
        }
        for (int i = 1 ; i <= 2*N ; i++ ) {
            factorial2N = factorial2N * i;
            //System.out.println("Factorial of 2N is: " + factorial2N);
        }
        for (int i = 1 ; i <= N+1 ; i++ ) {
            factorial3N = factorial3N * i;
            //System.out.println("Factorial of 3N is: " + factorial3N);
        }
        System.out.println("Catalan`s number is " + factorial2N/(factorialN*factorial3N));
    }
}
