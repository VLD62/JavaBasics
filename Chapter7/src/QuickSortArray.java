import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by vld62 on 2/27/17.
 * Напишете програма, която сортира целочислен масив по алгоритъма
 "quick sort".
 */
public class QuickSortArray {
    public static void main (String [] Args){
         //Creation of user input based unsorted array
        Scanner in = new Scanner(System.in);
        int length;
        System.out.println("Enter array length: ");
        length = in.nextInt();
        int[] Array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter " + i + " element of the Array.");
            Array[i] = in.nextInt();
        }
        System.out.println("Array is " + Arrays.toString(Array));
       //Call quick sort
        int low = 0;
        int high = Array.length - 1;

        quickSort(Array, low, high);
        //Output of sorted array
        System.out.println("Sorted Array is :" + Arrays.toString(Array));
    }
    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;

        if (low >= high)
            return;

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);
    }
}
