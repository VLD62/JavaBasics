import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by vld62 on 3/19/17.
 * Даден е масив с цели числа. Напишете програма, която проверява дали
 в масива съществуват едно или повече числа, чиято сума е N.
 */
public class CheckExistingElementsSumN {

    public static void findEqualElementsToN (int Array[], int N) {
        int sum = 0, start = 0, end =0;
        boolean sumFound = false;
        for (int i = 0; i < Array.length - 1; i++)
        {
            sum = Array[i];

            for (int j = i + 1; j < Array.length; j++)
            {
                sum += Array[j];
                if (sum == N)
                {
                    start = i;
                    end = j;
                    sumFound = true;
                    break;
                }
            }

            if (sumFound) break;
        }

        if (sumFound) {
           System.out.print("There are elements in the Array with sum equals to " + N + ".");
        } else {
            System.out.println("No elements found in the Array with sum equals to " + N + "." );
        }
        ///



    }

    public static void  main (String [] Args){
        int N, x, S;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter maximum numbers in array: ");
        S = in.nextInt();
        int[] Array = new int[S];
        for (int i = 0; i < S; i++) {
            System.out.println("Enter " + i + " number in array: ");
            x = in.nextInt();
            Array[i] = x;
        }
        System.out.println("Elements of Array are: " + Arrays.toString(Array));
        System.out.println("Enter number N: ");
        N = in.nextInt();
        ///Find Elements of array with sum equal to N
        findEqualElementsToN(Array,N);

    }

}
