/**
 * Created by viliev on 2.3.2017 г.
 * Превърнете числото 1111010110011110(2)
 * в шестнадесетична и десетична бройна система.
 */
public class ConvertBinaryToDecHex {
    public static void main (String [] Args){

        // Binary to hexadecimal

        // Binary to decimal
        long N = 1111010110011110L;
        int decimal =0 , p = 0 , decimal2 = 0;
        while(true){
            if(N == 0){
                break;
            } else {
                long temp = N%10;
                decimal += temp*Math.pow(2, p);
                N = N/10;
                p++;
            }
        }
        decimal2 = decimal;
        int remainder =0;
        String hex = "";
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6',
                '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while(decimal > 0){
            remainder = decimal % 16;
            hex = hexDigits[remainder] + hex;
            decimal = decimal / 16;
        }
        System.out.println("Hexadecimal number of binary 1111010110011110 is: " + hex);
        System.out.println("Decimal number of binary 1111010110011110 is: " + decimal2);



    }
}
