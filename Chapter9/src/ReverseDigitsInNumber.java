import java.util.Scanner;

/**
 * Created by viliev on 10.3.2017 г..
 * Напишете метод, който отпечатва цифрите на дадено десетично число в обратен ред.
 * Например 256, трябва да бъде отпечатано като 652.
 */
public class ReverseDigitsInNumber {
    public static void ReverseDigits (int x){
       int y;
        for(int i = 0; i < x  ; i ++){
            y = x % 10;
            System.out.print(y);
            x = x / 10;
            if( x < 10){
                System.out.print(x);
                x = 0;
            }
        }

    }

    public static void main (String [] args){
        int N;
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert number: ");
        N = in.nextInt();
        ReverseDigits(N);
    }

}
