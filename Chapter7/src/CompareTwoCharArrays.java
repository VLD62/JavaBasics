import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by viliev on 20.2.2017 г..
 * Да се напише програма, която сравнява два масива от тип char лексикографски (буква по буква)
 * и проверява кой от двата е по-рано в лексикографската подредба.
 */
public class CompareTwoCharArrays {
    public static void main (String [] Args){
        String N,M,K,L;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter maximum number of strings in array 1: ");
        N = in.nextLine();
        String[] Array1 = new String[Integer.parseInt(N)];
        for (int i = 0 ; i < Array1.length; i++) {
            System.out.println("Enter " + i + " string in array 1: ");
            Array1[i] = in.nextLine();
        }
        System.out.println("Elements of Array 1 are: " + Arrays.toString(Array1));
        System.out.println("Enter maximum number of strings in Array 2: ");
        M = in.nextLine();
        String[] Array2 = new String[Integer.parseInt(M)];
        for (int i = 0 ; i < Array2.length; i++) {
            System.out.println("Enter " + i + " number in Array 2: ");
            Array2[i] = in.nextLine();
        }
        System.out.println("Elements of Array 2are: " + Arrays.toString(Array2));
        K = Character.toString(Arrays.toString(Array1).charAt(1));
        L = Character.toString(Arrays.toString(Array2).charAt(1));
        if (K.compareTo(L) >= 0)
        {
            System.out.println("Array 1 is lexigrapically bigger or equal to Array2");// testArray[0] is lexigraphically "bigger" or equal
        } else {
            System.out.println("Array 1 is lexigrapically smaller than Array2");// testArray[1] is lexigraphically "bigger"
        }



    }
}
