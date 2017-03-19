import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by vld62 on 3/19/17.
 * Реализирайте алгоритъма "сортиране чрез сливане" (merge-sort). При
 него началният масив се разделя на две равни по големина части, които
 се сортират (чрез merge-sort) и след това двете сортирани части се
 сливат, за да се получи целият масив в сортиран вид.
 */
public class MergeSort {

    public static void main (String [] args) {
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
        Integer[] newArray = new Integer[Array.length];
        int i = 0;
        for (int value : Array) {
            newArray[i++] = Integer.valueOf(value);
        }

        System.out.println("Array is " + Arrays.toString(Array));
        //Call merge sort
        mergeSort(newArray);
        //Output of sorted array
        System.out.println("Sorted Array is " + Arrays.toString(newArray));
    }

    public static Comparable[] mergeSort(Comparable[] list)
    {
        //If list is empty; no need to do anything
        if (list.length <= 1) {
            return list;
        }

        //Split the array in half in two parts
        Comparable[] first = new Comparable[list.length / 2];
        Comparable[] second = new Comparable[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);

        //Sort each half recursively
        mergeSort(first);
        mergeSort(second);

        //Merge both halves together, overwriting to original array
        merge(first, second, list);
        return list;
    }
    private static void merge(Comparable[] first, Comparable[] second, Comparable[] result) {
        //Index Position in first array - starting with first element
        int iFirst = 0;

        //Index Position in second array - starting with first element
        int iSecond = 0;

        //Index Position in merged array - starting with first position
        int iMerged = 0;

        //Compare elements at iFirst and iSecond,
        //and move smaller element at iMerged
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst].compareTo(second[iSecond]) < 0) {
                result[iMerged] = first[iFirst];
                iFirst++;
            } else {
                result[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++;
        }
        //copy remaining elements from both halves - each half will have already sorted elements
        System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
        System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
    }
}




