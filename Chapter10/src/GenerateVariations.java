import java.util.Scanner;

/**
 * Created by viliev on 13.3.2017 г..
 * Напишете програма, която генерира всички вариации с повторение на n елемента от k-ти клас.
 Примерен вход:
 n = 3
 к = 2
 Примерен изход:
 (1 1), (1 2), (1 3), (2 1), (2 2), (2 3), (3 1), (3 2), (3 3)
 */
public class GenerateVariations {

    public static void generateVariations (int[] array, int index, int start, int end) {

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
                array[index] = i;
                generateVariations(array, index + 1, i, end);
            }
        }
    }

    public static void main (String[] Args) {
        int n, k;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number n: ");
        n = in.nextInt();
        System.out.print("Enter number k: ");
        k = in.nextInt();
        int[] array = new int[k];
        generateVariations(array, 0, 1, n);
    }


}


