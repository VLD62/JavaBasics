import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by viliev on 24.2.2017 г..
 * Напишете програма, която създава следните квадратни матрици и ги
 извежда на конзолата във форматиран вид. Размерът на матриците се
 въвежда от конзолата.
 */
public class CustomSquareMatrix {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int rows, cols, rowsValue, colsValue;
        System.out.println("Enter number of rows of the matrix:");
        rows = in.nextInt();
        System.out.println("Enter number of columns of the matrix:");
        cols = in.nextInt();
        int[][] matrix = new int[rows][cols];

        // Filling the matrix:
        for (int row = 0; row < rows; row++ )
            for ( int col = 0; col < cols; col++ )
            {
                System.out.print("Enter number for coordinates is matrix["+row+","+col+"]: ");
                matrix[row][col] = in.nextInt();
            }
        // Print the matrix on the console:
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }
}
