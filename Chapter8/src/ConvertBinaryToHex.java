import java.util.Scanner;

/**
 * Created by vld62 on 3/3/17.
 * Да се напише програма, която преобразува двоично число в шестна-
 десетично.
 */
public class ConvertBinaryToHex {

    public static int dec2hex (int N){
    int remainder =0;
    String hex = "";
    char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6',
            '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while(N > 0){
        remainder = N % 16;
        hex = hexDigits[remainder] + hex;
        N = N / 16;
    }
    return hex;
    }
}
