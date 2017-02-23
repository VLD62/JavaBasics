import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by viliev on 23.2.2017 г..
 * Да се напише програма, която намира последователност от числа в масив,
 * които имат сума равна на число, въведено от конзолата (ако има такава).
 * Пример: {4, 3, 1, 4, 2, 5, 8}, S=11  {4, 2, 5}.
 */
public class ArrayElementsSumEqualsToN {
    public static void  main (String [] Args){
        int N, x, S;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter maximum numbers in array: ");
        N = in.nextInt();
        int[] Array = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Enter " + i + " number in array: ");
            x = in.nextInt();
            Array[i] = x;
        }
        System.out.println("Elements of Array are: " + Arrays.toString(Array));
        System.out.println("Enter number S: ");
        S = in.nextInt();
    }
}
