/**
 * Created by viliev on 2.3.2017 г..
 * Превърнете шестнайсетичните числа 2A3E, FA, FFFF, 5A0E9
 * в двоична и десетична бройна система.
 */
public class ConvertHexBinaryDecimal {
    public static void main(String[] args) {

    int dec1 = Integer.parseInt("2A3E", 16);
    int dec2 = Integer.parseInt("FA", 16);
    int dec3 = Integer.parseInt("FFFF", 16);
    int dec4 = Integer.parseInt("5A0E9", 16);

    System.out.println("Binary eqivalent of hexadecimal 2A3E is "+Integer.toBinaryString(dec1));
    System.out.println("Decimal eqivalent of hexadecimal 2A3E is "+ dec1);

    System.out.println("Binary eqivalent of hexadecimal FA is "+Integer.toBinaryString(dec2));
    System.out.println("Decimal eqivalent of hexadecimal FA is "+ dec2);

    System.out.println("Binary eqivalent of hexadecimal FFFF is "+Integer.toBinaryString(dec3));
    System.out.println("Decimal eqivalent of hexadecimal FFFF is "+ dec3);

    System.out.println("Binary eqivalent of hexadecimal 5A0E9 is "+Integer.toBinaryString(dec4));
    System.out.println("Decimal eqivalent of hexadecimal 5A0E9 is "+ dec4);
    }
}
