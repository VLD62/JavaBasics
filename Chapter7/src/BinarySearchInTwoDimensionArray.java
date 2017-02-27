import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by viliev on 27.2.2017 г..
 * Да се реализира двоично търсене (binary search) в сортиран целочислен масив.
 */
public class BinarySearchInTwoDimensionArray {
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

        System.out.println("Enter searched number: ");
        number = in.nextInt();

        index = Arrays.binarySearch(Array, number);

        if (index >= 0){
            System.out.println("Number is on " + index +" index of the Array.");
        }
        else System.out.println("Number wasn't found.");

    }
}
