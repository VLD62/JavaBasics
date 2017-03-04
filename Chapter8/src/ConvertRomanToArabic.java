import java.util.Scanner;

/**
 * Created by vld62 on 3/4/17.
 * Да се напише програма, която преобразува римските числа в арабски.
 */
public class ConvertRomanToArabic {
    public static void main(String[] Args) {
        String roman;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Roman number: ");
        roman = in.nextLine().toUpperCase();

        char ch []  = roman.toCharArray();

        int arabic = 0, digitValue = 0,
                prevDigitValue = Integer.MAX_VALUE;

        for (int i = 0; i < ch.length; i++) {
            switch (ch[i]) {
                case 'M':
                    digitValue = 1000;
                    break;
                case 'D':
                    digitValue = 500;
                    break;
                case 'C':
                    digitValue = 100;
                    break;
                case 'L':
                    digitValue = 50;
                    break;
                case 'X':
                    digitValue = 10;
                    break;
                case 'V':
                    digitValue = 5;
                    break;
                case 'I':
                    digitValue = 1;
                    break;
            }
            arabic += digitValue;
            if (prevDigitValue < digitValue) {
                arabic -= 2 * prevDigitValue;
            }

            prevDigitValue = digitValue;
        }

        System.out.println("Roman number is  " + roman + " which converted to arabic is "+ arabic);

    }
}