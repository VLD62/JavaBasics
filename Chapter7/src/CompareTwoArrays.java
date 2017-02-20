import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by viliev on 20.2.2017 г..
 * Да се напише програма, която чете два масива от конзолата и проверява дали са еднакви.
 */
public class CompareTwoArrays {
    public static void main (String [] Args){
        int N,M,x,y, check = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter maximum numbers in array 1: ");
        N = in.nextInt();
        int[] Array1 = new int[N];
        for (int i = 0 ; i < N; i++) {
            System.out.println("Enter " + i + " number in array 1: ");
            x = in.nextInt();
            Array1[i] = x;
        }
        System.out.println("Elements of Array are: " + Arrays.toString(Array1));
        System.out.println("Enter maximum numbers in Array 2: ");
        M = in.nextInt();
        int[] Array2 = new int[M];
        for (int i = 0 ; i < M; i++) {
            System.out.println("Enter " + i + " number in Array 2: ");
            y = in.nextInt();
            Array2[i] = y;
        }
        System.out.println("Elements of Array are: " + Arrays.toString(Array2));
        System.out.println("Comparing two arrays...");
        if (Array1.length == Array2.length){
            System.out.println("Arrays have same length.. checking elements..");
            for (int i = 0; i < N; i++){
                if (Array1[i] == Array2[i]){
                    System.out.println("Number " + i + " is equal in both Arrays.");
                    } else {
                    System.out.println("Number " + i + " is not equal in both Arrays.");
                    check = 1;
                }
            }
            if (check == 0) {
                System.out.println("Arrays have equal elements!");
            } else {
                System.out.println("Arrays have different elements!");
            }
        } else {
            System.out.println("Arrays have different length!");
        }


    }
}
