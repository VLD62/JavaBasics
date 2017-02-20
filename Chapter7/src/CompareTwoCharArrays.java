import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by viliev on 20.2.2017 г..
 * Да се напише програма, която сравнява два масива от тип char лексикографски (буква по буква)
 * и проверява кой от двата е по-рано в лексикографската подредба.
 */
public class CompareTwoCharArrays {
    public static void main (String [] Args){
        int N,M;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter maximum number of strings in array 1: ");
        N = in.nextInt();
        String[] Array1 = new String[N];
        for (int i = 0 ; i < Array1.length; i++) {
            System.out.println("Enter " + i + " string in array 1: ");
            Array1[i] = in.nextLine();
        }
        System.out.println("Elements of Array are: " + Arrays.toString(Array1));
        System.out.println("Enter maximum number of strings in Array 2: ");
        M = in.nextInt();
        String[] Array2 = new String[M];
        for (int i = 0 ; i < Array2.length; i++) {
            System.out.println("Enter " + i + " number in Array 2: ");
            Array2[i] = in.nextLine();
        }
        System.out.println("Elements of Array are: " + Arrays.toString(Array2));
        /*System.out.println("Comparing two arrays...");
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
        }*/


    }
}
