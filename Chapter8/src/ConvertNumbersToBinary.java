/**
 * Created by viliev on 2.3.2017 г..
 * Превърнете числата 151, 35, 43, 251 и -0,41 в двоична бройна система.
 */
public class ConvertNumbersToBinary {
    public static void main (String [] Args){
        System.out.println("Binary eqivalent of 151 = " + Integer.toString(151, 2));
        System.out.println("Binary eqivalent of 35 = " + Integer.toString(35, 2));
        System.out.println("Binary eqivalent of 43 = " + Integer.toString(43, 2));
        System.out.println("Binary eqivalent of 251 = " + Integer.toString(251, 2));
        double d = -0.41;
        System.out.println("Binary eqivalent of -0,41 = " +Long.toBinaryString(Double.doubleToRawLongBits(d)));


    }



}
