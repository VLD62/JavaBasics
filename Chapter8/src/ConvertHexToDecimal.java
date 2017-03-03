import java.util.Scanner;

/**
 * Created by vld62 on 3/3/17.
 * Да се напише програма, която преобразува шестнадесетично число в
 десетично.
 */
public class ConvertHexToDecimal {
    public static void main (String [] args){
        int remainder =0;
        String hex = "";
        String hexDigits = "0123456789ABCDEF";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter hexadecimal number: ");
        hex = in.nextLine();
        hex = hex.toUpperCase();
        for (int i = 0; i < hex.length();i++){
            char c = hex.charAt(i);
            int d = hexDigits.indexOf(c);
            remainder = 16*remainder +d;
        }
        System.out.println("Decimal number is: " + remainder);
    }
}
