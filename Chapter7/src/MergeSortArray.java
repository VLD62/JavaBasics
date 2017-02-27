import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by viliev on 27.2.2017 г..
 * Напишете програма, която сортира целочислен масив по алгоритъма "merge sort".
 */
public class MergeSortArray {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int length;
        System.out.println("Enter array length: ");
        length = in.nextInt();


        int[] Array = new int[length];

        for (int i = 0; i < length; i++)
        {
            System.out.println("Enter " + i + " element of the Array.");
            Array[i] = in.nextInt();
        }

        System.out.println("Array is "+ Arrays.toString(Array));


        mergeSort(Array);

        System.out.println("Sorted Array is "+ Arrays.toString(Array));
        for (int j = 0; j < Array.length; j++) {
            System.out.println(Array[j]);
        }

    }

    static void mergeSort(int[] A) {
        if (A.length > 1) {
            int q = A.length/2;

    //changed range of leftArray from 0-to-q to 0-to-(q-1)
            int[] leftArray = Arrays.copyOfRange(A, 0, q-1);
    //changed range of rightArray from q-to-A.length to q-to-(A.length-1)
            int[] rightArray = Arrays.copyOfRange(A,q,A.length-1);

            mergeSort(leftArray);
            mergeSort(rightArray);

            merge(A,leftArray,rightArray);
        }
    }

    static void merge(int[] a, int[] l, int[] r) {
        int totElem = l.length + r.length;
        //int[] a = new int[totElem];
        int i,li,ri;
        i = li = ri = 0;
        while ( i < totElem) {
            if ((li < l.length) && (ri<r.length)) {
                if (l[li] < r[ri]) {
                    a[i] = l[li];
                    i++;
                    li++;
                }
                else {
                    a[i] = r[ri];
                    i++;
                    ri++;
                }
            }
            else {
                if (li >= l.length) {
                    while (ri < r.length) {
                        a[i] = r[ri];
                        i++;
                        ri++;
                    }
                }
                if (ri >= r.length) {
                    while (li < l.length) {
                        a[i] = l[li];
                        li++;
                        i++;
                    }
                }
            }
        }
        //return a;

     System.out.println("Array is "+ Arrays.toString(Array));
    }

}


