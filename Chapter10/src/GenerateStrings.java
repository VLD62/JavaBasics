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

    public static void generateStrings  (String [] array, int index, int start, int end){
        if (index >= array.length) {
            System.out.print("(");
            for (int i = 0; i < array.length; i++)
                if (i < array.length - 1) {
                    System.out.print(array[i] + " ");
                } else {
                    System.out.print(array[i]);
                }
            System.out.print("), ");
        } else {
            for (int i = start; i <= end; i++) {
                array[] ;
                generateStrings(array, index + 1, i, end);
            }
        }
    }

    public static void main (String [] args){
        int k,N;
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
        generateStrings(Array,k,0,1);
    }
}
