import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by viliev on 9.3.2017 г..
 * Напишете метод, който проверява дали елемент, намиращ се на дадена
 позиция от масив, е по-голям, или съответно по-малък от двата му
 съседа.
 */
public class CheckElementInArray {

    static void CheckArrayElement(int position, int[] arr)
    {
        if (position == 0)
        {
            if (arr[0] < arr[1]) System.out.printf("%d is smaller than it's right.", arr[0]);
            else if (arr[0] > arr[1]) System.out.printf("%d is bigger than it's right.", arr[0]);
            else System.out.printf("%d is equal to it's right.", arr[0]);
        }
        else if (position == arr.length - 1)
        {
            if (arr[arr.length - 1] < arr[arr.length - 2]) System.out.printf("%d is smaller than it's left.", arr[position]);
            else if (arr[arr.length - 1] > arr[arr.length - 2]) System.out.printf("%d is bigger than it's left.", arr[position]);
            else System.out.printf("%d is equal to it's left.", arr[position]);
        }
        else
        {
            if (arr[position] < arr[position - 1])
            {
                if (arr[position] < arr[position + 1]) System.out.printf("%d is smaller than it's neighbours.", arr[position]);
                else if (arr[position] == arr[position + 1]) System.out.printf("%d is smaller than it's left and equal to it's right.", arr[position]);
                else System.out.printf("%d is smaller than it's left and bigger than it's right.", arr[position]);
            }
            else if (arr[position] == arr[position - 1])
            {
                if (arr[position] < arr[position + 1]) System.out.printf("%d is euqal to it's left and smaller than it's right.", arr[position]);
                else if (arr[position] == arr[position + 1]) System.out.printf("%d is equal to it's neighbours.", arr[position]);
                else System.out.printf("%d is equal to it's left and bigger than it's right.", arr[position]);
            }
            else
            {
                if (arr[position] < arr[position + 1]) System.out.printf("%d is bigger than it's left and smaller than it's right.", arr[position]);
                else if (arr[position] == arr[position + 1]) System.out.printf("%d is bigger than it's left and equal to it's right.", arr[position]);
                else System.out.printf("%d is bigger than it's neighbours.", arr[position]);
            }
        }
    }

    public static void main (String [] Args ){
        int n,x,y;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert array length: ");
        x = in.nextInt();
        int [] Array = new int[x];
        for (int i = 0 ; i < x; i++) {
            System.out.println("Enter " + i + " number in the array: ");
            y = in.nextInt();
            Array[i] = y;
        }
        System.out.println("Please insert number for a position in the array: ");
        n = in.nextInt();
        System.out.println("Entered array is: " + Arrays.toString(Array));
        CheckArrayElement(n,Array);
    }

}
