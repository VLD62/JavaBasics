import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by viliev on 21.2.2017 г..
 * Напишете програма, която намира максималната редица от нарастващи елементи в масив.
 * Пример: {3, 2, 3, 4, 2, 2, 4}  {2, 3, 4}.
 */
public class FindMaxIncreasingNumbersInArray {
    public static void main (String [] Args){
        int N,x,start = 0, lenght = 1, bestStart = 0, bestLenght = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter maximum numbers in array: ");
        N = in.nextInt();
        int[] Array = new int[N];
        for (int i = 0 ; i < N; i++) {
            System.out.println("Enter " + i + " number in array: ");
            x = in.nextInt();
            Array[i] = x;
        }
        System.out.println("Elements of Array are: " + Arrays.toString(Array));
        for (int i = 1; i < Array.length ; i++){
            if (Array[i] > Array [i - 1])
            {
                start = i;
                lenght++;
                if (bestLenght < lenght)
                {
                    bestStart = start;
                    bestLenght = lenght;
                }
            } else {
                lenght = 1;
            }
        }
        for (int j = bestStart - bestLenght + 1; j <= bestStart; j++){
            System.out.println(Array[j] + " ");
        }
        System.out.println();

    }
}
