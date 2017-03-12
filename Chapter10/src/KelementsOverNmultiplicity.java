import java.util.Scanner;

/**
 * Created by vld62 on 3/12/17.
 * Напишете програма, която генерира и отпечатва всички комбинации с
 повторение на k елемента над n-елементно множество.
 Примерен вход:
 n = 3
 к = 2
 Примерен изход:
 (1 1), (1 2), (1 3), (2 2), (2 3), (3 3)
 */
public class KelementsOverNmultiplicity {

    public static void generateCombinations(int[] array, int index, int start, int end) {
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
                generateCombinations(array, index + 1, i, end);
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
        generateCombinations(array, 0, 1, n);
    }
}


