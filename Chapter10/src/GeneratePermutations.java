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

    public static void generatePermutations (int n) {
        //Generate array based on input
        int Array [] = new int[n];
        for ( int i = 0; i < Array.length; i++) {
            Array[i] = i+1;
        }
        System.out.println("Elements of Array are: " + Arrays.toString(Array));
        //Permutations
    }


    public static void main (String [] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number: ");
        n = in.nextInt();
        generatePermutations(n);
    }
}
