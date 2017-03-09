import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by viliev on 9.3.2017 г..Напишете метод, който намира колко пъти дадено число се среща в даден масив.
 * Напишете програма, която проверява дали този метод работи правилно.
 */
public class FindNumberOccurrenceinArray {
    public static void FindNumberOccurence (int z, int y[]) {
        int temp =0;
        for (int i = 0; i < y.length; i++){
            if (y[i] == z){
                temp++;
            }
        }
        System.out.println("Number " + z + " is found " + temp + " times in the array." );
    }

    public static void main (String [] Args ){
        int n,x,y;
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert number: ");
        n = in.nextInt();
        System.out.println("Please insert array length: ");
        x = in.nextInt();
        int [] Array = new int[x];
        for (int i = 0 ; i < x; i++) {
            System.out.println("Enter " + i + " number in the array: ");
            y = in.nextInt();
            Array[i] = y;
        }
        System.out.println("Entered array is: " + Arrays.toString(Array));
        FindNumberOccurence(n , Array);
    }

}
