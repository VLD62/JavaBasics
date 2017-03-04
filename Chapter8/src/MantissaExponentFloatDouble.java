import java.util.Scanner;

/**
 * Created by vld62 on 3/4/17.
 * Да се напише програма, която определя (отпечатва) стойността на
 мантисата, знака на мантисата и стойността на експонентата за числа
 от тип float и double.
 */
public class MantissaExponentFloatDouble {
    public static void main (String [] args) {
        Scanner in  = new Scanner(System.in);
        String sign;
        System.out.println("Enter number: ");
        double N = in.nextDouble();

        long bits = Double.doubleToLongBits(3.25);

        int exponent = (int)Math.log10(N) + 1;
        double mantissa = N * Math.pow(10.0, -exponent);
        boolean isNegative = (bits & 0x8000000000000000L) != 0;


        if (isNegative){
            sign = "-";
        } else  {
            sign = "+";
        }

        System.out.println("Entered number is: " + N);
        System.out.println("Sing of mantissa is: " + sign);
        System.out.println("Manitssa is: " + mantissa);
        System.out.println("Exponent is: " + exponent);
    }
}
