import java.util.Scanner;

/**
 * Created by vld62 on 2/18/17.
 */
public class FibonacciFirstN {
    public static void main (String [] Args){
        int x =0, y = 1;
        int N, z = x+y;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number: ");
        N = in.nextInt();

        System.out.print("Nubers are: "+ " " + x );
        for (int i = 2;i<=N;++i){
            System.out.print(" "+z);
            z=x+y;
            x = y;
            y = z;
        }

    }
}
