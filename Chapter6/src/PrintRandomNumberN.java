import java.util.Scanner;
import java.util.Random;
/**
 * Created by vld62 on 2/19/17.
 */
public class PrintRandomNumberN {
    public static void main (String [] args){
        int N, random = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert number N: ");
        Random randomGenerator = new Random();
        N = in.nextInt();
        for (int i = 1; i <= N;i++){
        random = randomGenerator.nextInt(N);
        }
        System.out.println("Random number generater between 1 and N is: " + random);
    }
}
