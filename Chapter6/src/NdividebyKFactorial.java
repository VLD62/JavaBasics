import java.util.Scanner;

/**
 * Created by vld62 on 2/18/17.
 */
public class NdividebyKFactorial {
    public static void main (String [] args){
        int N,K,M,x;
        int factorialN = 1, factorialM = 1, factorialK = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter N (should be bigger than 0) :");
        N = in.nextInt();
        System.out.println("Please enter K (should be bigger than 0 and lower than N) :");
        K = in.nextInt();
        if (K < 0 | N <0 | N < K){
            System.out.println("Sorry this program works with numbers N bigger than K and also bigger than 0 only!");
        } else {
            M = N - K;
            for ( x = 1 ; x <= N ; x++ ) {
                factorialN = factorialN * x;
            }
            System.out.println("Factorial of N is: " + factorialN);
             for ( x = 1 ; x <= K ; x++ ) {
                factorialK = factorialK * x;
            }
            System.out.println("Factorial of K is: " + factorialK);
             for ( x = 1 ; x <= M ; x++ ) {
                factorialM = factorialM * x;
            }
            System.out.println("Factorial of M is: " + factorialM);
            System.out.println("N!*K!/(N-K)! is equal to: " + (factorialK*factorialN/factorialM));


        }
    }

}
