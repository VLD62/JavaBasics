import java.util.Scanner;
/**
 * Created by vld62 on 3/3/17.
 * Да се напише програма, която преобразува двоично число в десетично
 по схемата на Хорнер.
 */
public class BinaryToDecimalHorner {

        public static void main (String [] Args) {
            int decimal = 0;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter binary number: ");
            String binary = in.nextLine();

            String array = binary;
            char ch []  = array.toCharArray();
            int [] temp = new int [ch.length];
            for (int i = 0; i < ch.length; i++) {
                temp[i] = Integer.parseInt(""+ch[i]);
            }



            for (int i = 0; i < temp.length; i++)
            {
                decimal  *= 2;
                if (temp[i] == 1)
                {
                    decimal ++;
                }
            }

            System.out.println("Result is " + decimal + " "+ binary);
        }
}
