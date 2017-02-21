import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by viliev on 21.2.2017 г..
 */
public class FindMaximumEqualNumbersInArray {
    public static void main (String [] Args){
        int N,x,length = 1,maxlength = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter maximum numbers in array: ");
        N = in.nextInt();
        int[] Array = new int[N];
        for (int i = 0 ; i < N; i++) {
            System.out.println("Enter " + i + " number in array: ");
            x = in.nextInt();
            Array[i] = x;
        }
        System.out.println("Elements of Array are: " + Arrays.toString(Array));
        int value = Array[0];
        for (int i= 1; i < Array.length; i++) {
            length = 1;
            while(Array[i] == Array [i-1]){
                length++;
                i++;
                if (i == Array.length){
                    break;
                }
            }
            if(maxlength < length) {
                maxlength = length;
                value = Array[i-1];
            }
        }
        System.out.print("Line of equal elements is : ");
        for (int i = 0; i < maxlength - 1; i++) {
            System.out.print(value + ", ");
        }
        System.out.println(value + ".");

    }
}
