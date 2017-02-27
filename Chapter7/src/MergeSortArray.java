import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by viliev on 27.2.2017 г..
 * Напишете програма, която сортира целочислен масив по алгоритъма "merge sort".
 */
public class MergeSortArray {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int length, number, index;
        System.out.println("Enter array length: ");
        length = in.nextInt();


        int[] Array = new int[length];

        for (int i = 0; i < length; i++)
        {
            System.out.println("Enter " + i + " element of the Array.");
            Array[i] = in.nextInt();
        }

        System.out.println("Array is "+ Arrays.toString(Array));

    }
}
