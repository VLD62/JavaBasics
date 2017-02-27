import java.util.Scanner;

/**
 * Created by vld62 on 2/27/17.
 * Напишете програма, която намира всички прости числа в диапазона
 [1..10 000 000].
 */
public class AllPrimesFromOneToTenMln {
    /* OLD public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number: ");
        n = in.nextInt();

        // initially assume all integers are prime
        boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // mark non-primes <= n using Sieve of Eratosthenes
        for (int factor = 2; factor*factor <= n; factor++) {
            System.out.println(factor);
            // if factor is prime, then mark multiples of factor as nonprime
            // suffices to consider mutiples factor, factor+1, ...,  n/factor
            if (isPrime[factor]) {
                for (int j = factor; factor*j <= n; j++) {
                    isPrime[factor*j] = false;
                }
            }
        }

        // count primes
        int primes = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) primes++;
        }
        System.out.println("The number of primes <= " + n + " is " + primes);
    }*/

    public static void main(String[] args) {
        initialize(args);
        findPrimes();
        displayPrimes();
    }

    private static void initialize(String[] args) {
    }

    private static void findPrimes() {
    }

    private static void displayPrimes() {
    }
}
