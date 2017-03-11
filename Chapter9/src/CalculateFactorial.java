import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by vld62 on 3/11/17.
 * Напишете програма, която пресмята и отпечатва n! за всяко n в
 интервала [1..100].
 */
public class CalculateFactorial {

    public static void CalculateFactorialOfN (double N) {
        BigInteger factorial = BigInteger.valueOf(1);

        for (int i = 1 ; i <= N ; i++ ) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of N is: " + factorial);


    }

    public static void main (String [] Args ) {
        int n;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert number: ");
        n = in.nextInt();
        CalculateFactorialOfN(n);

    }
}
