import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by vld62 on 3/19/17.
 * Даден е масив с цели числа и число N. Напишете програма, която
 намира всички подмножества от числа от масива, които имат сума N.
 */
public class NumberOfElementsEqualToN {

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

        if (sumFound) for (int i = start; i <= end; i++) System.out.print(" " + Array[i]);
        else System.out.println("No sum found.");
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
