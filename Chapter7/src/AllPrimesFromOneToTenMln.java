/**
 * Created by vld62 on 2/27/17.
 * Напишете програма, която намира всички прости числа в диапазона
 [1..10 000 000].
 More details on Sieve of Eratosthenes on http://www.challenge.nm.org/archive/07-08/kickoff/classes/java/intro-java-algorithms-sieve.html
 */
public class AllPrimesFromOneToTenMln {

    private static int upperLimit = 10000000;
    private static boolean[] flags;

    public static void main(String[] args) {
        initialize(args);
        findPrimes();
        displayPrimes();
    }

    private static void initialize(String[] args) {

           /*
       * Get the upper limit from the user input parameters (if any).
       */
        if (args.length > 0) {
            upperLimit = Integer.parseInt(args[0]);
        }
           /*
       * Create a set of boolean (true/false) flags, corresponding to the
       *     integers from 2 to upper limit, in order.*/
        flags = new boolean[upperLimit + 1];
        /* Set position to 2.
       * While position is less than or equal to upper limit:
       *   Set the flag corresponding to position to the value false.
       *   Increment position by 1.
       */
        for (int position = 0; position <= upperLimit; position++) {
            flags[position] = false;
        }


    }

    private static void findPrimes() {
              /*
       * Set position to 2.
       * While position is less than or equal to square root of upper limit:
       */
        for (int position = 2; position <= Math.sqrt(upperLimit); position++) {
       /*   If the flag corresponding to position has the value false:*/
            if (!flags[position]) {
            /*
             * Set multiple to twice the value of position.
             * While multiple is less than or equal to upper limit:
             *   Set the flag corresponding to multiple to the value true.
             *   Increment multiple by position.
             */
                int multiple = position * 2;
                while (multiple <= upperLimit) {
                    flags[multiple] = true;
                    multiple += position;
                }
            }
        /* Increment position by 1. */

        }
    }

    private static void displayPrimes() {
              /*
       * Set position to 2.
       * While position is less than or equal to upper limit:
       *   If the flag corresponding to position is not true:
       *     Display position.
       *   Increment position by 1.
       */
        for (int position = 2; position <= upperLimit; position++) {
            if (!flags[position]) {
                System.out.print(position + ", ");
            }
        }

    }
}

