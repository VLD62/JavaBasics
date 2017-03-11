import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by vld62 on 3/11/17.
 * Напишете метод, който умножава два многочлена.
 */
public class MultiplyTwoPolynomials {
    public static void Multiply (int a [], int b []) {
        int c [] = new int[2*a.length];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                 c[i * a.length + j] =a[i] * b[j];
            }
        }
        //System.out.println("New array is " + Arrays.toString(c));

        for (int num : c) {
            sum = sum + num;
        }
        System.out.println("Sum of two polynomials is " + sum);

    }
    public static void main (String [] Args) {
        //Creation of user input based unsorted array
        Scanner in = new Scanner(System.in);
        int length, sum =0;
        System.out.println("Enter number of polynomials: ");
        length = in.nextInt();
        int[] Array1 = new int[length];
        for (int i = 0; i < length; i++) {
                System.out.println("Enter " + i + " polynomial of set 1.");
                Array1[i] = in.nextInt();
            }
        System.out.println("Set 1 of polynomials is " + Arrays.toString(Array1));
        int[] Array2 = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter " + i + " polynomial of set 2.");
            Array2[i] = in.nextInt();
        }
        System.out.println("Set 2 of polynomials is " + Arrays.toString(Array2));
        Multiply(Array1, Array2);
    }


}
