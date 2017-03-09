import java.util.Scanner;

/**
 * Created by viliev on 9.3.2017 г..Създайте метод getMax() с два целочислени (int) параметъра, който връща по-голямото от двете числа.
 * Напишете програма, която прочита три цели числа от конзолата и отпечатва най-голямото от тях, изпол-звайки метода getMax().
 */
public class getMaxCompareNumbers {

    public static void getMax ( int x, int y) {
        if (x > y){
            System.out.println("Bigger number is : " + x);
        }
        else if (x == y) {
            System.out.println("All numbers are equal to: " + x);
        }
        else {
            System.out.println("Biggest number is : " + y);
        }
    }

    public static void main (String [] args){
        int a,b,c,d;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        a = in.nextInt();
        System.out.println("Please enter second number: ");
        b = in.nextInt();
        System.out.println("Please enter third number: ");
        c = in.nextInt();

        if ( a > b) {
            d = a;
        }

        else if (a == b) {
            d = a;
        }

        else {
            d = b;
        }
        getMax(c , d);


    }

}
