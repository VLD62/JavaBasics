import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by viliev on 13.3.2017 г..
 * Нека е дадено множество от символни низове. Да се напише програма,
 * която генерира всички подмножества съставено от k на брой символни низа,
 * избрани измежду елементите на това множество.
 Примерен вход:
 strings = {'test', 'rock', 'fun'}
 k = 2
 Примерен изход:
 (test rock), (test fun), (rock fun)
 */
public class GenerateStrings {


        private static void combination(final int n, final String[] array, final String currentWord) { // example of N = 3
        if (n == 0) {
            System.out.print("(" +currentWord + " )");
        } else {
            for (int i = 0; i < array.length; i++) {
                combination(n - 1, array, currentWord + " " +  array[i] );
            }
        }
    }


    public static void main (String [] args){
        int N, k;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter k: ");
        k = in.nextInt();
        System.out.println("Enter maximum number of strings in array 1: ");
        N = in.nextInt();
        String[] Array = new String[N];
        for (int i = 0 ; i < Array.length; i++) {
            System.out.println("Enter " + i + " string in the array: ");
            Array[i] = in.next();
        }
        System.out.println("Elements of Array are: " + Arrays.toString(Array));
        combination(k,Array, "");
    }


}
