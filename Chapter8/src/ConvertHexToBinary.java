import java.util.Scanner;
/**
 * Created by vld62 on 3/3/17.
 * Да се напише програма, която преобразува шестнадесетично число в
 двоично.
 */
public class ConvertHexToBinary {
    public static int hex2decimal(String s)
    {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
    public static void main(String args[])
    {
        String hex;
        int decimal, i=1, j;
        int binary[] = new int[100];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Hexadecimal Number : ");
        hex = in.nextLine();
        /* first convert the hex to decimal */
        decimal = hex2decimal(hex);
        /* now convert the decimal to binary */
        while(decimal != 0)
        {
            binary[i++] = decimal%2;
            decimal = decimal/2;
        }
        System.out.print("Equivalent Binary Number is :\n");
        for(j=i-1; j>0; j--)
        {
            System.out.print(binary[j]);
        }
    }
}
