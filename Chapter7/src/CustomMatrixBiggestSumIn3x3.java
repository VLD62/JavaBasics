import java.util.Scanner;

/**
 * Created by viliev on 24.2.2017 г..
 * Напишете програма, която създава следните квадратни матрици и ги
 извежда на конзолата във форматиран вид. Размерът на матриците се
 въвежда от конзолата.
 */
public class CustomMatrixBiggestSumIn3x3 {
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
        // Print 3x3 matrix with greatest sum:

        for (int tempRow = 0; tempRow < matrix.length - 2; tempRow++)
            for (int tempCol = 0; tempCol < matrix[0].length - 2; tempCol++)
            {
                int tempSum = matrix[row, col] + matrix[row, col + 1] + matrix[row, col + 2] +
                    matrix[row + 1, col] + matrix[row + 1, col + 1] + matrix[row + 1, col + 2] +
                    matrix[row + 2, col] + matrix[row + 2, col + 1] + matrix[row + 2, col + 2];

                if (tempSum > sum)
                {
                    row = tempRow;
                    col = tempCol;
                    sum = tempSum;
                }
            }

        Console.WriteLine("Result");
        Console.WriteLine("{0} {1} {2}", matrix[row, col], matrix[row, col + 1], matrix[row, col + 2]);
        Console.WriteLine("{0} {1} {2}", matrix[row + 1, col], matrix[row + 1, col + 1], matrix[row + 1, col + 2]);
        Console.WriteLine("{0} {1} {2}", matrix[row + 2, col], matrix[row + 2, col + 2], matrix[row + 2, col + 2]);
        Console.WriteLine("The maximum sum is {0}.", sum);


    }
}
