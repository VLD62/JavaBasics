/**
 * Created by viliev on 15.2.2017 г..
 */
import java.util.Scanner;

public class InputDigitOutputName {
    public static void main (String [] args){
        int x;
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert number between 0 and 9: ");
        x = in.nextInt();
        if ( x < 0 | x > 9) {
            System.out.println("Sorry this program works with numbers between 0 and 9");
        } else {
            switch (x){
                case 0: System.out.println("Въведеното чило е нула.");break;
                case 1: System.out.println("Въведеното чило е едно.");break;
                case 2: System.out.println("Въведеното чило е две.");break;
                case 3: System.out.println("Въведеното чило е три.");break;
                case 4: System.out.println("Въведеното чило е четири.");break;
                case 5: System.out.println("Въведеното чило е пет.");break;
                case 6: System.out.println("Въведеното чило е шест.");break;
                case 7: System.out.println("Въведеното чило е седем.");break;
                case 8: System.out.println("Въведеното чило е осем.");break;
                case 9: System.out.println("Въведеното чило е девет.");break;
            }
        }
    }
}
