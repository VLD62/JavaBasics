import java.util.Scanner;

/**
 * Created by vld62 on 2/18/17.
 */
public class CalculateSumforNumberFactorial {
    public static void main (String [] args){
    int N,x,factorialN = 1;
    double K,sqrX,S = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number N: ");
    N = in.nextInt();
    System.out.println("Enter number x: ");
    x = in.nextInt();
    for (int i = 1 ; i <= N ; i++ ) {
            factorialN = factorialN * i;
            sqrX = Math.pow((double)x,(double)i);
            K = (double)factorialN/sqrX;
            S = K+K;
        System.out.println("Factorial of i is: " + factorialN);
        System.out.println("Sqr of x is: " + sqrX);
        System.out.println("K is: " + K);
        System.out.println("S is: " + S);

        }
        System.out.println("S=1+(1!/x)+(2!/x^2)+..(n!/x^n)="+(1+S));
    }
}
