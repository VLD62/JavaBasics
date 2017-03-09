import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by viliev on 9.3.2017 г..
 * Напишете метод, който проверява дали елемент, намиращ се на дадена
 позиция от масив, е по-голям, или съответно по-малък от двата му
 съседа.
 */
public class CheckElementInArray {

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
    }

}
