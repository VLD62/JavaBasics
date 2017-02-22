import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by vld62 on 2/22/17.
 * Сортиране на масив означава да подредим елементите му в нарастващ
 (намаляващ) ред. Напишете програма, която сортира масив. Да се
 използва алгоритъма "Selection sort".
 */
public class SortingArray {
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
        //Sort of the array
        for (int i = 0; i < Array.length - 1; ++i)
        {
            int minIndex = i;
            for (int j = i + 1; j < Array.length; ++j)
            {
                if (Array[j] < Array[minIndex])
                {
                    minIndex = j;
                }
            }
            int temp = Array[i];
            Array[i] = Array[minIndex];
            Array[minIndex] = temp;
        }
        System.out.println("Sorted array is "+ Arrays.toString(Array));


    }
}
