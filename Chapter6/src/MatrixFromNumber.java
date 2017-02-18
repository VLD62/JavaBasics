import java.util.Scanner;

/**
 * Created by vld62 on 2/18/17.
 */
public class MatrixFromNumber {
    public static void main (String [] args){
        int N;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        N = in.nextInt();
        if (N>20 | N <0){
            System.out.println("Sorry, this program works with numbers greater than 0 and lower than 20 only");
        } else {
            for (int col=0; col<N;col++){
                for (int row = col+1; row<=col+N; row++){
                    if (row <10)
                    {
                        System.out.print("");
                    }
                    System.out.print(row+" ");
                }
                System.out.println();
            }
        }
    }
}
