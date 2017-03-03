import java.util.Scanner;

/**
 * Created by vld62 on 3/3/17.
 * Да се напише програма, която преобразува двоично число в десетично
 по схемата на Хорнер.
 */
public class BinaryToNumericHorner {

        public static void main (String [] Args) {
            int deci = 0;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter binary number: ");
            String binary = in.nextLine();
            int length = binary.length();
            int power = length - 1;

            for (int i = 0; i < length; i++) {
                deci += (int) (int.Parse(binary[i].ToString()) * Math.pow(2, power));
                power--;
            }

            System.out.println("Result is " + deci);
        }
}
