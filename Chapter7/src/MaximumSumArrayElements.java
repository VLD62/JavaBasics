import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by viliev on 22.2.2017 г..
 * Да се напише програма, която чете от конзолата две цели числа N и K, и масив от N елемента.
 * Да се намерят тези K елемента, които имат максимална сума.
 */
public class MaximumSumArrayElements {
    public static void main (String [] args) {
        int N, x, K;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter maximum numbers in array: ");
        N = in.nextInt();
        int[] Array = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Enter " + i + " number in array: ");
            x = in.nextInt();
            Array[i] = x;
        }
        System.out.println("Elements of Array are: " + Arrays.toString(Array));
        System.out.println("Enter number of elements from the array: ");
        K = in.nextInt();
        int sum = Array[0];
        int sum2 =0;
        int y = Array[0];
        for (int i= 1; i < Array.length;i++){

            for (int j = 0; j<K;j++) {
                sum = Array[i - 1] + Array[i];
            }
            if (sum>sum2){
                sum2=sum;
                y=i;
            }
            sum=0;
        }
        System.out.print("\n");
        System.out.print("Maximum sum of elements is: ");
        for (int i = K-1; i > 0; i--) {
            System.out.print(Array[y-i]+", ");
        }
        System.out.print(Array[y]);
        System.out.print(".");

    }
}