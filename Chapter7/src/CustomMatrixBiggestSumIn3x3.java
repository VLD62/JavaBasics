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
        int rows, cols, rowsValue, colsValue, sum = Integer.MIN_VALUE;
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
                int tempSum = matrix[tempRow][tempCol] + matrix[tempRow][tempCol + 1] + matrix[tempRow][tempCol + 2] +
                    matrix[tempRow + 1][tempCol] + matrix[tempRow + 1][tempCol + 1] + matrix[tempRow + 1][tempCol + 2] +
                    matrix[tempRow + 2][tempCol] + matrix[tempRow + 2][tempCol + 1] + matrix[tempRow + 2][tempCol + 2];

                if (tempSum > sum)
                {
                    rows = tempRow;
                    cols = tempCol;
                    sum = tempSum;
                }
            }

        System.out.println("Result");
        System.out.println("["+matrix[rows][cols] + "] [" + matrix[rows][cols + 1] + "] [" + matrix[rows][cols + 2] + "]");
        System.out.println("["+matrix[rows + 1][cols]+ "] [" + matrix[rows + 1][cols + 1]+ "] [" +  matrix[rows + 1][cols + 2] + "]");
        System.out.println("["+matrix[rows + 2][cols]+ "] [" + matrix[rows + 2][cols + 2]+ "] [" + matrix[rows + 2][cols + 2] + "]");
        System.out.println("The maximum sum is :" + sum);


    }
}
