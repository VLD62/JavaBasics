import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by viliev on 10.3.2017 г..
 * Напишете метод, който връща позицията на първия елемент на масив,
 * който е по-голям от двата свои съседи едновременно, или -1, ако няма такъв елемент.
 */
public class getBiggerElementInArray {

    static int n = 0;
    public static void getBiggerElement (int arr[]) {

        for (int i = 1; i < arr.length - 1; i++) {

            if (arr[i] > arr[i-1] && arr[i] > arr [i+1]){
                n = arr[i];
                break;
            }

        }
        if (n == 0) {
            System.out.println("-1");
        } else {
            System.out.println("Number " + n + " in the array is bigger than its neighbours");
        }

    }

    public static void main (String [] Args ){
        int x,y;
        int n = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert array length: ");
        x = in.nextInt();
        int [] Array = new int[x];
        for (int i = 0 ; i < x; i++) {
            System.out.println("Enter " + i + " number in the array: ");
            y = in.nextInt();
            Array[i] = y;
        }
        System.out.println("Entered array is: " + Arrays.toString(Array));
        getBiggerElement(Array);




    }

}
