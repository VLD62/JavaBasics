import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by vld62 on 3/19/17.
 * Напишете програма, която генерира и отпечатва пермутациите на
 числата 1, 2, ..., n, за дадено цяло число n.
 Примерен вход:
 n = 3
 Примерен изход:
 (1, 2, 3), (1, 3, 2), (2, 1, 3), (2, 3, 1), (3, 1, 2), (3, 2, 1)
 */
public class GeneratePermutations {

    public static void generatePermutations (int[] array, int index)
    {
        if (index == array.length)
        {
            System.out.print("(");
            for (int i = 0; i < array.length; i++)
                if (i < array.length - 1) {
                System.out.print(array[i]+ " ");
                } else {
                System.out.print(array[i]);
                }
            System.out.print("), ");
        }
        else
        {
            for (int i = index; i < array.length; i++)
            {
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
                generatePermutations(array, index + 1);
                temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
        }
    }


    public static void main (String [] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number: ");
        n = in.nextInt();
        //Generate array based on input
        int Array [] = new int[n];
        for ( int i = 0; i < Array.length; i++) {
            Array[i] = i+1;
        }
        System.out.println("Elements of Array are: " + Arrays.toString(Array));
        generatePermutations(Array, 0);
    }
}
