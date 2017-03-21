import java.util.Scanner;

/**
 * Created by viliev on 21.3.2017 г..Напишете програма, която по дадени два катета намира хипотенузата на правоъгълен триъгълник.
 * Реализирайте въвеждане на дължините на катетите от стандартния вход, а за пресмятането на хипотенузата използвайте методи на класа Math.
 */
public class CalculateHypotenuse {

    public static void caluclateHypotenuse (int a, int b) {
            double c ;
            c = Math.sqrt(a*a + b*b);
            System.out.println("Length of hypotenuse is: " + c);

    }

    public static void main (String [] Args) {
        int a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter value for side of triangle a");
        a = in.nextInt();
        System.out.println("Please enter value for side of tri5angle b");
        b = in.nextInt();
        caluclateHypotenuse(a,b);

    }
}
