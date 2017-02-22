import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by vld62 on 2/22/17.
 */
public class MostRepeatedElementInArray {
        public static void main (String [] Args) {

            int N, x;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter maximum numbers in array 1: ");
            N = in.nextInt();
            int[] Array = new int[N];
            for (int i = 0; i < N; i++) {
                System.out.println("Enter " + i + " number in array : ");
                x = in.nextInt();
                Array[i] = x;
            }
            System.out.println("Array is "+ Arrays.toString(Array));
            System.out.println("Array length is " + Array.length);

    }
}

