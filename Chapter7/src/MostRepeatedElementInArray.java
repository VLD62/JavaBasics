import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by vld62 on 2/22/17.
 * Напишете програма, която намира най-често срещания елемент в масив.
 * Пример: {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3}  4 (5 пъти).
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


            int counter = 0, counter1 = 1, number = 0;
            for (int i = 0; i < Array.length - 1;i++){
                if (Array[i] == Array[i+1]) {
                    counter1++;
                } else {
                   counter1 = 1;
                }
                if (counter1>counter) {
                   counter = counter1;
                   number = Array[i];
                }
            }
            System.out.println(number + " found " + counter + " times.");
    }
}

